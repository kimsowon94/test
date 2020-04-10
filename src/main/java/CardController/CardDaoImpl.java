package CardController;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import UserVo.UserInfoCareerVo;
import UserVo.UserInfoEduVo;
import UserVo.UserInfoLicenVo;
import UserVo.UserInfoQualifiVo;
import UserVo.UserInfoSkillVo;
import UserVo.UserInfoTrainingVo;
import UserVo.UserInfoVo;

@Repository
public class CardDaoImpl implements CardDao {
	
	@Autowired
	SqlSession sqlSession;
	
	// �ҷ����� ����Ʈ
	@Override
	public List<UserInfoVo> getHistoryInfo(UserInfoVo userInfo) {
		return sqlSession.selectList("userHis.getHistoryInfo", userInfo);
	}
	// �ҷ����� count
	@Override
	public int getHistoryInfoCnt(UserInfoVo userInfo) {
		return sqlSession.selectOne("userHis.getHistoryInfoCnt", userInfo);
	}
	
	// �����̷�ī��(�⺻����) �󼼺���
	@Override
	public UserInfoVo getHistoryInfoDetail(UserInfoVo userInfoVo) {
		return sqlSession.selectOne("userHis.userInfoSelect", userInfoVo);
	}
	
	// �����̷�ī��(�з�) �󼼺���
	@Override
	public List<UserInfoCareerVo> getEduDetailList(int userIdx) {
		return sqlSession.selectList("edu.getEduDetailList", userIdx);//
	}
	
	// �����̷�ī��(�ڰ���) �󼼺���
	@Override
	public List<UserInfoCareerVo> getQualifiDetailList(int userIdx) {
		return sqlSession.selectList("qualifi.getQualifiDetailList", userIdx);//
	}
	
	// �����̷�ī��(���) �󼼺��� ����Ʈ
	@Override
	public List<UserInfoCareerVo> getCareerDetailList(int userIdx) {
		return sqlSession.selectList("career.getCareerDetailList", userIdx);//
	}
	
	// �����̷�ī��(����) �󼼺���
	@Override
	public List<UserInfoCareerVo> getTrainingDetailList(int userIdx) {
		return sqlSession.selectList("training.getTrainingDetailList", userIdx);//
	}
	
	// �����̷�ī��(�ܱ���ɷ�) �󼼺���
	@Override
	public List<UserInfoCareerVo> getLicenDetailList(int userIdx) {
		return sqlSession.selectList("licen.getLicenDetailList", userIdx);//
	}
	
	// �����̷�ī��(������Ʈ���) �󼼺���
	@Override
	public List<UserInfoCareerVo> getSkillDetailList(int userIdx) {
		return sqlSession.selectList("skill.getSkillDetailList", userIdx);//
	}

	
	
	
	// �⺻���� insert
	@Override
	public int infoInsert(UserInfoVo userVo) {
		int result =  sqlSession.insert("userHis.infoInsert", userVo);	// �⺻���� insert

		return result;
	}
	
	// ���insert
	@Override
	public int careerInsert(UserInfoCareerVo userCareerVo) {
		return sqlSession.insert("career.careerInsert", userCareerVo);
	}

	// �з�insert
	@Override
	public int eduInsert(UserInfoEduVo userEduVo) {
		return sqlSession.insert("edu.eduInsert", userEduVo);
	}

	// ���ɷ�insert
	@Override
	public int licenInsert(UserInfoLicenVo userLicenVo) {
		return sqlSession.insert("licen.licenInsert", userLicenVo);
	}

	// �ڰ���insert
	@Override
	public int qualifiInsert(UserInfoQualifiVo userQualiVo) {
		return sqlSession.insert("qualifi.qualifiInsert", userQualiVo);
	}

	// ������Ʈ���insert
	@Override
	public int skillInsert(UserInfoSkillVo userSkillVo) {
		return sqlSession.insert("skill.skillInsert", userSkillVo);
	}

	// ����insert
	@Override
	public int trainingInsert(UserInfoTrainingVo userTrainingVo) {
		return sqlSession.insert("training.trainingInsert", userTrainingVo);
	}
	
	
	
	
	// �⺻���� update
	@Override
	public int infoUpdate(UserInfoVo userVo) {
		return sqlSession.update("userHis.infoUpdate", userVo);
	}
//	// ��� update
//	@Override
//	public int careerUpdate(UserInfoCareerVo i) {
//		return sqlSession.update("career.careerUpdate", i);
//	}
//	// �з� update
//	@Override
//	public int eduUpdate(UserInfoEduVo i) {
//		return sqlSession.update("edu.eduUpdate", i);
//	}
//	// �������/�ܱ���ɷ� update
//	@Override
//	public int licenUpdate(UserInfoLicenVo i) {
//		return sqlSession.update("licen.licenUpdate", i);
//	}
//	// �ڰ��� update
//	@Override
//	public int qualifiUpdate(UserInfoQualifiVo i) {
//		return sqlSession.update("qualifi.qualifiUpdate", i);
//	}
//	// ������Ʈ��� update
//	@Override
//	public int skillUpdate(UserInfoSkillVo i) {
//		return sqlSession.update("skill.skillUpdate", i);
//	}
//	// ���� update
//	@Override
//	public int trainingUpdate(UserInfoTrainingVo i) {
//		return sqlSession.update("training.trainingUpdate", i);
//	}
	
	// ��� delete
	@Override
	public void careerDelete(int userIdx) {
		sqlSession.delete("career.careerDelete", userIdx);
	}
	
	// �з� delete
	@Override
	public void eduDelete(int userIdx) {
		sqlSession.delete("edu.eduDelete", userIdx);
	}
	
	// �з� delete
	@Override
	public void licenDelete(int userIdx) {
		sqlSession.delete("licen.licenDelete", userIdx);
	}
	
	// �ڰ��� delete
	@Override
	public void qualifiDelete(int userIdx) {
		sqlSession.delete("qualifi.qualifiDelete", userIdx);
	}
	
	// ������Ʈ��� delete
	@Override
	public void skillDelete(int userIdx) {
		sqlSession.delete("skill.skillDelete", userIdx);
	}
	
	// ���� delete
	@Override
	public void trainingDelete(int userIdx) {
		sqlSession.delete("training.trainingDelete", userIdx);
	}
	
	// ������ �ο�����
	@Override
	public List<UserInfoVo> getGroupInfo() {
		return sqlSession.selectList("userHis.getGroupInfo");
	}
	
	
	
	
}
