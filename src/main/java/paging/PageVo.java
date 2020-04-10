package paging;

public class PageVo {
	private int pageSize = 10;		// �� �������� �Խñ� ��
	private int rangeSize = 5;		// �� ���� ������ ��
	private int pageNo = 1;			// ���� ������
	private int curRange = 1;		// ���� ��
	private int listCnt;			// �� �Խñ� ��
	private int pageCnt;			// �� ������ ��
	private int rangeCnt;			// �� �� ��
	private int startPage = 1;		// ���� ����������
	private int endPage = 1;		// ���� ��������
	private int startIndex;			// ���� ���� �ε���
	private int endIndex;			// ���� �� �ε���
	private int prevPage;			// ���� ������
	private int nextPage;			// ���� ������
	
	public PageVo() {}
	
	public PageVo(int listCnt, int pageNo, int userInfoDataSize) {
		setPageNo(pageNo);	// ����������
		
		setStartIndex(pageNo, userInfoDataSize);
		setEndIndex(pageNo, userInfoDataSize);
		
		setListCnt(listCnt);	// �� �Խù� ��
		
		setPageCnt(listCnt);	// �� ������ ��
		
		setRangeCnt(pageNo);	// �� �� ��
		
		rangeSetting(pageNo);			// �� ����
	}
	
	public void setPageCnt(int pageCnt) {
		this.pageCnt = (int) Math.ceil(listCnt*1.0/pageSize);	// 1. ��ü ������ �� ���ϴ� ���
	}
	
	public void setRangeCnt(int rangeCnt) {
		this.rangeCnt = (int) Math.ceil(pageCnt*1.0/rangeSize);	// 2. �� �� ���� ���
	}
	
	public void rangeSetting(int pageNo) {
		setCurRange(pageNo);        
        this.startPage = (curRange - 1) * rangeSize + 1;		// 3. ���� ��µǴ� ���� ������������ȣ�� �� ������ ��ȣ ���
        this.endPage = startPage + rangeSize - 1;				// 4. 3���� ����(���� ���� �� ������ ��ȣ���)
        
        if(endPage > pageCnt){				// 5. �� if���� �� ó���� ��������ȣ�� 1�� ���������� ������ ���� ������������ ��ȣ�� 
            this.endPage = pageCnt;					// ��ü �������� ���� �޶����⿡ �� ������ ������ ������ �������� Ŀ�� �� ���� ����.
        }
        
        this.prevPage = pageNo - 1;
        this.nextPage = pageNo + 1;
	}
	
	public void setCurRange(int curRange) {
		this.curRange = (int)((pageNo-1)/rangeSize) + 1;
	}

	public void setStartIndex(int pageNo, int userInfoDataSize) {
		this.startIndex = (pageNo - 1) * userInfoDataSize + 1;
	}

	public void setEndIndex(int pageNo, int userInfoDataSize) {
		this.endIndex = (pageNo) * userInfoDataSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRangeSize() {
		return rangeSize;
	}

	public void setRangeSize(int rangeSize) {
		this.rangeSize = rangeSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getListCnt() {
		return listCnt;
	}

	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getCurRange() {
		return curRange;
	}

	public int getPageCnt() {
		return pageCnt;
	}

	public int getRangeCnt() {
		return rangeCnt;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}
	
}
