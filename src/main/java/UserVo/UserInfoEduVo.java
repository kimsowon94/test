package UserVo;

import java.util.List;

public class UserInfoEduVo {
	private int eduIdx;				// �з� PK
	private int userIdx;			// ����� PK
	private String eduSchoolName;	// �б���
	private String eduStatus;		// ����
	private String eduYear;			// ���г�
	private String eduMonth;		// ���п�
	
	private List<UserInfoEduVo> eduList;
	
	public int getEduIdx() {
		return eduIdx;
	}
	public void setEduIdx(int eduIdx) {
		this.eduIdx = eduIdx;
	}
	public int getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}
	public String getEduSchoolName() {
		return eduSchoolName;
	}
	public void setEduSchoolName(String eduSchoolName) {
		this.eduSchoolName = eduSchoolName;
	}
	public String getEduStatus() {
		return eduStatus;
	}
	public void setEduStatus(String eduStatus) {
		this.eduStatus = eduStatus;
	}
	public String getEduYear() {
		return eduYear;
	}
	public void setEduYear(String eduYear) {
		this.eduYear = eduYear;
	}
	public String getEduMonth() {
		return eduMonth;
	}
	public void setEduMonth(String eduMonth) {
		this.eduMonth = eduMonth;
	}
	public List<UserInfoEduVo> getEduList() {
		return eduList;
	}
	public void setEduList(List<UserInfoEduVo> eduList) {
		this.eduList = eduList;
	}
	
}
