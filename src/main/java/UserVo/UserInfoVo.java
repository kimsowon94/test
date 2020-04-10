package UserVo;

public class UserInfoVo {
	private int userIdx; 			// user_info PK(��Ϲ�ȣ)
	private String userRegisterDate; 	// �������
	private String userName; 			// ����ڸ�
	private String userSocialSecunum; 	// ����� �ֹι�ȣ
	private String userSex; 			// ����
	private String userComp; 			// ȸ���
	private String userCompEnterdate; 	// ȸ���Ի���
	private String userDept; 			// �μ�
	private String userSpot; 			// ����
	private String userArmyServ; 		// ����
	private String userMaritalStatus; 	// ��ȥ����
	private String userArmyServEnter; 	// �Դ���(����)
	private String userArmyServLeave; 	// ������(����)
	private String userArmyServPeriod; 	// ����/����
	private String userTelnumWired; 	// ��ȭ��ȣ
	private String userTelnumWireless; 	// �޴�����ȣ
	private String userEmail; 			// �̸���
	private String userZipcode; 		// �����ȣ
	private String userAddress; 		// �ּ�
	
	private String careerDate;			// ���
	private int careerCount;			// ��º� �ο���
	
//	------------------�ҷ����� �˻�����--------------------
	private String userListSearchPeriod;	// �˻�����(�̸�/ȸ��/�μ�)
	private String userListSearchWord;		// �˻���
	private String userCareerLength;		// ��»���(1,2,3,...10�� �̻�)
	private int userInfoDataSize;		// ����Ʈ ������ ����(10, 20��)
	private String userGender;			// ��������(��/��)
	
//	-----------------page-----------------------
	private int startIndex;
	private int endIndex;
	private int pageNo;
	
	
	public int getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}
	public String getUserRegisterDate() {
		return userRegisterDate;
	}
	public void setUserRegisterDate(String userRegisterDate) {
		this.userRegisterDate = userRegisterDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSocialSecunum() {
		return userSocialSecunum;
	}
	public void setUserSocialSecunum(String userSocialSecunum) {
		this.userSocialSecunum = userSocialSecunum;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserComp() {
		return userComp;
	}
	public void setUserComp(String userComp) {
		this.userComp = userComp;
	}
	public String getUserCompEnterdate() {
		return userCompEnterdate;
	}
	public void setUserCompEnterdate(String userCompEnterdate) {
		this.userCompEnterdate = userCompEnterdate;
	}
	public String getUserDept() {
		return userDept;
	}
	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}
	public String getUserSpot() {
		return userSpot;
	}
	public void setUserSpot(String userSpot) {
		this.userSpot = userSpot;
	}
	public String getUserArmyServ() {
		return userArmyServ;
	}
	public void setUserArmyServ(String userArmyServ) {
		this.userArmyServ = userArmyServ;
	}
	public String getUserMaritalStatus() {
		return userMaritalStatus;
	}
	public void setUserMaritalStatus(String userMaritalStatus) {
		this.userMaritalStatus = userMaritalStatus;
	}
	public String getUserArmyServEnter() {
		return userArmyServEnter;
	}
	public void setUserArmyServEnter(String userArmyServEnter) {
		this.userArmyServEnter = userArmyServEnter;
	}
	public String getUserArmyServLeave() {
		return userArmyServLeave;
	}
	public void setUserArmyServLeave(String userArmyServLeave) {
		this.userArmyServLeave = userArmyServLeave;
	}
	public String getUserArmyServPeriod() {
		return userArmyServPeriod;
	}
	public void setUserArmyServPeriod(String userArmyServPeriod) {
		this.userArmyServPeriod = userArmyServPeriod;
	}
	public String getUserTelnumWired() {
		return userTelnumWired;
	}
	public void setUserTelnumWired(String userTelnumWired) {
		this.userTelnumWired = userTelnumWired;
	}
	public String getUserTelnumWireless() {
		return userTelnumWireless;
	}
	public void setUserTelnumWireless(String userTelnumWireless) {
		this.userTelnumWireless = userTelnumWireless;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserZipcode() {
		return userZipcode;
	}
	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserListSearchPeriod() {
		return userListSearchPeriod;
	}
	public void setUserListSearchPeriod(String userListSearchPeriod) {
		this.userListSearchPeriod = userListSearchPeriod;
	}
	public String getUserListSearchWord() {
		return userListSearchWord;
	}
	public void setUserListSearchWord(String userListSearchWord) {
		this.userListSearchWord = userListSearchWord;
	}
	public String getUserCareerLength() {
		return userCareerLength;
	}
	public void setUserCareerLength(String userCareerLength) {
		this.userCareerLength = userCareerLength;
	}
	public int getUserInfoDataSize() {
		return userInfoDataSize;
	}
	public void setUserInfoDataSize(int userInfoDataSize) {
		this.userInfoDataSize = userInfoDataSize;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getCareerDate() {
		return careerDate;
	}
	public void setCareerDate(String careerDate) {
		this.careerDate = careerDate;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getCareerCount() {
		return careerCount;
	}
	public void setCareerCount(int careerCount) {
		this.careerCount = careerCount;
	}
	
}
