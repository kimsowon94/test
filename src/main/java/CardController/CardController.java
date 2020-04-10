package CardController;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.topia.topia.HomeController;

import UserVo.UserInfoCareerVo;
import UserVo.UserInfoEduVo;
import UserVo.UserInfoLicenVo;
import UserVo.UserInfoQualifiVo;
import UserVo.UserInfoSkillVo;
import UserVo.UserInfoTrainingVo;
import UserVo.UserInfoVo;
import paging.PageVo;

@Controller
public class CardController {
	
	@Autowired
	CardService cardService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/card/cardInput.do", method = RequestMethod.GET)
	public String cardInput(Model model) {
		model.addAttribute("status", "new");
		
		return "main";
	}
	
	// �ҷ����� ��ȸ
	@RequestMapping(value = "/personalHistory/getHistoryInfo.do", method = RequestMethod.POST)
	public ModelAndView getHistoryInfo(Locale locale, UserInfoVo userInfo, @RequestParam(defaultValue="1") int pageNo) { 
		ModelAndView mv = new ModelAndView();
//		System.out.println(userInfo.getUserGender());
		int infoCnt = cardService.getHistoryInfoCnt(userInfo);
		
		PageVo pVo = new PageVo(infoCnt, pageNo, userInfo.getUserInfoDataSize());
		
//		userInfo.setPageNo(pVo.getPageNo());	// pageVo�� pageNo�� boardVo�� pagaNo�� �����.
		userInfo.setStartIndex(pVo.getStartIndex());
		userInfo.setEndIndex(pVo.getEndIndex());
		
		List<UserInfoVo> list = cardService.getHistoryInfo(userInfo);
		
		
		mv.addObject("list", list);
		mv.addObject("page", pVo);
		mv.addObject("infoCnt", infoCnt);
		mv.setViewName("history/historyList");
		
		return mv;
	}
	
	// ������ �ο�����
	@RequestMapping(value = "/personalHistory/getGroupInfo.do", method = RequestMethod.POST)
	public ModelAndView getGroupInfo(Locale locale) { 
		ModelAndView mv = new ModelAndView();
		
		List<UserInfoVo> careerGrouplist = cardService.getGroupInfo();
		
		mv.addObject("careerGrouplist", careerGrouplist);
		mv.setViewName("history/groupInfo");
		
		return mv;
	}
	
	// �����̷�ī�� ��������ȸ
	@RequestMapping(value = "/personalHistory/getHistoryInfoDetail.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getHistoryInfoDetail(Locale locale, UserInfoVo userInfoVo) { 
		Map<String, Object> map = new HashMap<String, Object>();
		
		UserInfoVo resultVo = cardService.getHistoryInfoDetail(userInfoVo);	// �����̷�ī��(�⺻����) �󼼺���
		List<UserInfoCareerVo> eduList = cardService.getEduDetailList(userInfoVo.getUserIdx()); // �����̷�ī��(�з�) �󼼺���
		List<UserInfoCareerVo> qualifiList = cardService.getQualifiDetailList(userInfoVo.getUserIdx()); // �����̷�ī��(�ڰ���) �󼼺���
		List<UserInfoCareerVo> careerList = cardService.getCareerDetailList(userInfoVo.getUserIdx()); // �����̷�ī��(���) �󼼺���
		List<UserInfoCareerVo> trainingList = cardService.getTrainingDetailList(userInfoVo.getUserIdx()); // �����̷�ī��(����) �󼼺���
		List<UserInfoCareerVo> licenList = cardService.getLicenDetailList(userInfoVo.getUserIdx()); // �����̷�ī��(�ܱ���ɷ�) �󼼺���
		List<UserInfoCareerVo> skillList = cardService.getSkillDetailList(userInfoVo.getUserIdx()); // �����̷�ī��(������Ʈ���) �󼼺���
		
		map.put("status", "update");
		map.put("userInfo", resultVo);
		map.put("careerList", careerList);
		map.put("eduList", eduList);
		map.put("qualifiList", qualifiList);
		map.put("trainingList", trainingList);
		map.put("licenList", licenList);
		map.put("skillList", skillList);
		
//		mv.addObject("status", "update");
//		mv.addObject("userInfo", resultVo);
//		mv.setViewName("main");
		
		return map;
	}
	
	// �̷�ī�� �⺻���� ���
	@RequestMapping(value = "/personalHistory/cardInsert.do", method = RequestMethod.POST)
	@ResponseBody
	public Map cardInsert(UserInfoVo userVo, UserInfoCareerVo userCareerVo, UserInfoEduVo userEduVo, UserInfoLicenVo userLicenVo
						, UserInfoQualifiVo userQualiVo, UserInfoSkillVo userSkillVo, UserInfoTrainingVo userTrainingVo) {
		
		Map map = new HashMap();
		System.out.println("controller");
		int resultUserInfo = cardService.infoInsert(userVo, userCareerVo, userEduVo, userLicenVo, userQualiVo, userSkillVo, userTrainingVo);	// 1. �⺻���� insert
		
		if(resultUserInfo == 1) {
			map.put("result", "success");
		}else if(resultUserInfo < 1) {
			map.put("result", "fail");
		}
		
		return map;
	}
	
	// �̷�ī�� �⺻���� ����
	@RequestMapping(value = "/personalHistory/cardUpdate.do", method = RequestMethod.POST)
	@ResponseBody
	public Map cardUpdate(UserInfoVo userVo, UserInfoCareerVo userCareerVo, UserInfoEduVo userEduVo, UserInfoLicenVo userLicenVo
			, UserInfoQualifiVo userQualiVo, UserInfoSkillVo userSkillVo, UserInfoTrainingVo userTrainingVo) {
		
		Map map = new HashMap();
		System.out.println("controller");
		int resultUserInfo = cardService.cardUpdate(userVo, userCareerVo, userEduVo, userLicenVo, userQualiVo, userSkillVo, userTrainingVo);	// 1. �⺻���� update
		
		if(resultUserInfo == 1) {
			map.put("result", "success");
		}else if(resultUserInfo < 1) {
			map.put("result", "fail");
		}
		
		return map;
	}
	
}
