package UserVo;

import java.util.List;

public class UserInfoCareerVo {
	private int careerIdx;				// ��� PK
	private int userIdx;				// ����� PK
	private String careerCompName;		// ȸ���
	private String careerEnterdate;		// ���� ������
	private String careerLeavedate;		// ���� ������
	private String careerSpot;			// ����
	private String careerResponsib;		// ������
	
	private List<UserInfoCareerVo> careerList;
	
	public int getCareerIdx() {
		return careerIdx;
	}
	public void setCareerIdx(int careerIdx) {
		this.careerIdx = careerIdx;
	}
	public int getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}
	public String getCareerCompName() {
		return careerCompName;
	}
	public void setCareerCompName(String careerCompName) {
		this.careerCompName = careerCompName;
	}
	public String getCareerEnterdate() {
		return careerEnterdate;
	}
	public void setCareerEnterdate(String careerEnterdate) {
		this.careerEnterdate = careerEnterdate;
	}
	public String getCareerLeavedate() {
		return careerLeavedate;
	}
	public void setCareerLeavedate(String careerLeavedate) {
		this.careerLeavedate = careerLeavedate;
	}
	public String getCareerSpot() {
		return careerSpot;
	}
	public void setCareerSpot(String careerSpot) {
		this.careerSpot = careerSpot;
	}
	public String getCareerResponsib() {
		return careerResponsib;
	}
	public void setCareerResponsib(String careerResponsib) {
		this.careerResponsib = careerResponsib;
	}
	public List<UserInfoCareerVo> getCareerList() {
		return careerList;
	}
	public void setCareerList(List<UserInfoCareerVo> careerList) {
		this.careerList = careerList;
	}
	
	
}
