package CardController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UserVo.UserInfoCareerVo;
import UserVo.UserInfoEduVo;
import UserVo.UserInfoLicenVo;
import UserVo.UserInfoQualifiVo;
import UserVo.UserInfoSkillVo;
import UserVo.UserInfoTrainingVo;
import UserVo.UserInfoVo;

@Service
public class CardServiceImpl implements CardService {
	
	@Autowired
	CardDao cardDao;

	// 불러오기 리스트
	@Override
	public List<UserInfoVo> getHistoryInfo(UserInfoVo userInfo) {
		return cardDao.getHistoryInfo(userInfo);
	}
	// 불러오기 리스트 count
	@Override
	public int getHistoryInfoCnt(UserInfoVo userInfo) {
		return cardDao.getHistoryInfoCnt(userInfo);
	}

	// 개인이력카드(기본정보) 상세보기
	@Override
	public UserInfoVo getHistoryInfoDetail(UserInfoVo userInfoVo) {
		return cardDao.getHistoryInfoDetail(userInfoVo);
	}
	
	 // 개인이력카드(학력) 상세보기
	@Override
	public List<UserInfoCareerVo> getEduDetailList(int userIdx) {
		return cardDao.getEduDetailList(userIdx);
	}
	
	// 개인이력카드(자격증) 상세보기
	@Override
	public List<UserInfoCareerVo> getQualifiDetailList(int userIdx) {
		return cardDao.getQualifiDetailList(userIdx);
	}
	
	// 개인이력카드(경력) 상세보기 리스트
	@Override
	public List<UserInfoCareerVo> getCareerDetailList(int userIdx) {
		return cardDao.getCareerDetailList(userIdx);
	}
	
	// 개인이력카드(교육) 상세보기
	@Override
	public List<UserInfoCareerVo> getTrainingDetailList(int userIdx) {
		return cardDao.getTrainingDetailList(userIdx);
	}
	
	// 개인이력카드(외국어능력) 상세보기
	@Override
	public List<UserInfoCareerVo> getLicenDetailList(int userIdx) {
		return cardDao.getLicenDetailList(userIdx);
	}
	
	// 개인이력카드(프로젝트경력) 상세보기
	@Override
	public List<UserInfoCareerVo> getSkillDetailList(int userIdx) {
		return cardDao.getSkillDetailList(userIdx);
	}
	
	// insert
	@Override
	public int infoInsert(UserInfoVo userVo, UserInfoCareerVo userCareerVo, UserInfoEduVo userEduVo, UserInfoLicenVo userLicenVo
						, UserInfoQualifiVo userQualiVo, UserInfoSkillVo userSkillVo, UserInfoTrainingVo userTrainingVo) {
		System.out.println("등록");
		
		int result = 0;
		
		result = cardDao.infoInsert(userVo);
		
		if(result == 1) {
			for(UserInfoCareerVo i : userCareerVo.getCareerList()) {
				i.setUserIdx(userVo.getUserIdx());
				result = cardDao.careerInsert(i);		// 경력 insert
			}
			for(UserInfoEduVo i : userEduVo.getEduList()) {
				i.setUserIdx(userVo.getUserIdx());
				result = cardDao.eduInsert(i);		// 교육 insert
			}
			for(UserInfoLicenVo i : userLicenVo.getLicenList()) {
				i.setUserIdx(userVo.getUserIdx());
				result = cardDao.licenInsert(i);	// 보유기술/언어능력 insert
			}
			for(UserInfoQualifiVo i : userQualiVo.getQualifiList()) {
				i.setUserIdx(userVo.getUserIdx());
				result = cardDao.qualifiInsert(i);	// 자격증 insert
			}
			for(UserInfoSkillVo i : userSkillVo.getSkillList()) {
				i.setUserIdx(userVo.getUserIdx());
				result = cardDao.skillInsert(i);	// 프로젝트경력 insert
			}
			for(UserInfoTrainingVo i : userTrainingVo.getTrainingList()) {
				i.setUserIdx(userVo.getUserIdx());
				result = cardDao.trainingInsert(i);	// 교육 insert
			}
		}
		
		return result;
	}
	
	// update
	@Override
	public int cardUpdate(UserInfoVo userVo, UserInfoCareerVo userCareerVo, UserInfoEduVo userEduVo, UserInfoLicenVo userLicenVo
			, UserInfoQualifiVo userQualiVo, UserInfoSkillVo userSkillVo, UserInfoTrainingVo userTrainingVo) {
		System.out.println("수정");
		
		int result = 0;
		
		result = cardDao.infoUpdate(userVo);
		
		cardDao.careerDelete(userVo.getUserIdx());		// 경력정보 삭제 후 
		cardDao.eduDelete(userVo.getUserIdx());			// 학력정보 삭제 후 
		cardDao.licenDelete(userVo.getUserIdx());		// 보유기술/언어능력 삭제 후 
		cardDao.qualifiDelete(userVo.getUserIdx());		// 자격증정보 삭제 후 
		cardDao.skillDelete(userVo.getUserIdx());		// 프로젝트경력 삭제 후 
		cardDao.trainingDelete(userVo.getUserIdx());	// 교육정보 삭제 후 
		
		if(result == 1) {
			for(UserInfoCareerVo i : userCareerVo.getCareerList()) {
				i.setUserIdx(userVo.getUserIdx());
				
				result = cardDao.careerInsert(i);		// 경력 insert
			}
			for(UserInfoEduVo i : userEduVo.getEduList()) {
				i.setUserIdx(userVo.getUserIdx());
				
				result = cardDao.eduInsert(i);		// 학력육 insert
			}
			for(UserInfoLicenVo i : userLicenVo.getLicenList()) {
				i.setUserIdx(userVo.getUserIdx());
				
				result = cardDao.licenInsert(i);	// 보유기술/언어능력 insert
			}
			for(UserInfoQualifiVo i : userQualiVo.getQualifiList()) {
				i.setUserIdx(userVo.getUserIdx());
				
				result = cardDao.qualifiInsert(i);	// 자격증 insert
			}
			for(UserInfoSkillVo i : userSkillVo.getSkillList()) {
				i.setUserIdx(userVo.getUserIdx());
				
				result = cardDao.skillInsert(i);	// 프로젝트경력 insert
			}
			for(UserInfoTrainingVo i : userTrainingVo.getTrainingList()) {
				i.setUserIdx(userVo.getUserIdx());
				
				result = cardDao.trainingInsert(i);	// 교육 insert
			}
		}
		
		return result;
	}
	
	// 연차별 인원보기
	@Override
	public List<UserInfoVo> getGroupInfo() {
		return cardDao.getGroupInfo();
	}
	

	
}
