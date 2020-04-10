package CardController;

import java.util.List;

import UserVo.UserInfoCareerVo;
import UserVo.UserInfoEduVo;
import UserVo.UserInfoLicenVo;
import UserVo.UserInfoQualifiVo;
import UserVo.UserInfoSkillVo;
import UserVo.UserInfoTrainingVo;
import UserVo.UserInfoVo;

public interface CardDao {

	List<UserInfoVo> getHistoryInfo(UserInfoVo userInfo);	// �ҷ����� ����Ʈ
	int getHistoryInfoCnt(UserInfoVo userInfo);	// �ҷ�����count

	UserInfoVo getHistoryInfoDetail(UserInfoVo userInfoVo);		// �����̷�ī��(�⺻����) �󼼺���
	List<UserInfoCareerVo> getEduDetailList(int userIdx);		// �����̷�ī��(�з�) �󼼺���
	List<UserInfoCareerVo> getQualifiDetailList(int userIdx);	// �����̷�ī��(�ڰ���) �󼼺���
	List<UserInfoCareerVo> getCareerDetailList(int userIdx);	// �����̷�ī��(���) �󼼺��� ����Ʈ
	List<UserInfoCareerVo> getTrainingDetailList(int userIdx);	// �����̷�ī��(����) �󼼺���
	List<UserInfoCareerVo> getLicenDetailList(int userIdx);		// �����̷�ī��(�ܱ���ɷ�) �󼼺���
	List<UserInfoCareerVo> getSkillDetailList(int userIdx);		// �����̷�ī��(������Ʈ���) �󼼺���
	
	int infoInsert(UserInfoVo userVo);						// �⺻���� insert
	int careerInsert(UserInfoCareerVo userCareerVo);		// ���insert
	int eduInsert(UserInfoEduVo userEduVo);					// �з�insert
	int licenInsert(UserInfoLicenVo userLicenVo);			// ���ɷ�insert
	int qualifiInsert(UserInfoQualifiVo userQualiVo);		// �ڰ���insert
	int skillInsert(UserInfoSkillVo userSkillVo);			// ������Ʈ���insert
	int trainingInsert(UserInfoTrainingVo userTrainingVo);	// ����insert
	
	int infoUpdate(UserInfoVo userVo);			// �⺻���� update
//	int careerUpdate(UserInfoCareerVo i);		// ��� update
//	int eduUpdate(UserInfoEduVo i);				// �з� update
//	int licenUpdate(UserInfoLicenVo i);			// �������/�ܱ���ɷ� update
//	int qualifiUpdate(UserInfoQualifiVo i);		// �ڰ��� update
//	int skillUpdate(UserInfoSkillVo i);			// ������Ʈ��� update
//	int trainingUpdate(UserInfoTrainingVo i);	// ���� update
	
	void careerDelete(int userIdx);		// ��� delete
	void eduDelete(int userIdx);		// �з� delete
	void licenDelete(int userIdx);		// �з� delete
	void qualifiDelete(int userIdx);	// �ڰ��� delete
	void skillDelete(int userIdx);		// ������Ʈ��� delete
	void trainingDelete(int userIdx);	// ���� delete
	
	List<UserInfoVo> getGroupInfo();	// ������ �ο�����
	

	
	
	
}
