package CardController;

import java.util.List;

import UserVo.UserInfoCareerVo;
import UserVo.UserInfoEduVo;
import UserVo.UserInfoLicenVo;
import UserVo.UserInfoQualifiVo;
import UserVo.UserInfoSkillVo;
import UserVo.UserInfoTrainingVo;
import UserVo.UserInfoVo;

public interface CardService {

	List<UserInfoVo> getHistoryInfo(UserInfoVo userInfo);	// �ҷ����� ����Ʈ
	int getHistoryInfoCnt(UserInfoVo userInfo);	// �ҷ����� count

	UserInfoVo getHistoryInfoDetail(UserInfoVo userInfoVo);	// �����̷�ī��(�⺻����) �󼼺���
	List<UserInfoCareerVo> getEduDetailList(int userIdx); // �����̷�ī��(�з�) �󼼺���
	List<UserInfoCareerVo> getQualifiDetailList(int userIdx); // �����̷�ī��(�ڰ���) �󼼺���
	List<UserInfoCareerVo> getCareerDetailList(int userIdx);	// �����̷�ī��(���) �󼼺��� ����Ʈ
	List<UserInfoCareerVo> getTrainingDetailList(int userIdx); // �����̷�ī��(����) �󼼺���
	List<UserInfoCareerVo> getLicenDetailList(int userIdx); // �����̷�ī��(�ܱ���ɷ�) �󼼺���
	List<UserInfoCareerVo> getSkillDetailList(int userIdx); // �����̷�ī��(������Ʈ���) �󼼺���

	int infoInsert(UserInfoVo userVo, UserInfoCareerVo userCareerVo, UserInfoEduVo userEduVo, UserInfoLicenVo userLicenVo
				  , UserInfoQualifiVo userQualiVo, UserInfoSkillVo userSkillVo, UserInfoTrainingVo userTrainingVo);	// �⺻���� insert
	
	int cardUpdate(UserInfoVo userVo, UserInfoCareerVo userCareerVo, UserInfoEduVo userEduVo, UserInfoLicenVo userLicenVo
				  , UserInfoQualifiVo userQualiVo, UserInfoSkillVo userSkillVo, UserInfoTrainingVo userTrainingVo);	// �⺻���� update
	
	List<UserInfoVo> getGroupInfo();	// ������ �ο�����

	
	
	
}
