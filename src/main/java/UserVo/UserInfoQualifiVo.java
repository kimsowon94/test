package UserVo;

import java.util.List;

public class UserInfoQualifiVo {
	private int qualifiIdx;			// �ڰ��� PK
	private int userIdx;			// ����� PK
	private String qualifiName;		// �ڰ�����
	private String qualifiGetdate;	// �����
	
	private List<UserInfoQualifiVo> qualifiList;
	
	public int getQualifiIdx() {
		return qualifiIdx;
	}
	public void setQualifiIdx(int qualifiIdx) {
		this.qualifiIdx = qualifiIdx;
	}
	public int getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}
	public String getQualifiName() {
		return qualifiName;
	}
	public void setQualifiName(String qualifiName) {
		this.qualifiName = qualifiName;
	}
	public String getQualifiGetdate() {
		return qualifiGetdate;
	}
	public void setQualifiGetdate(String qualifiGetdate) {
		this.qualifiGetdate = qualifiGetdate;
	}
	public List<UserInfoQualifiVo> getQualifiList() {
		return qualifiList;
	}
	public void setQualifiList(List<UserInfoQualifiVo> qualifiList) {
		this.qualifiList = qualifiList;
	}
	
}
