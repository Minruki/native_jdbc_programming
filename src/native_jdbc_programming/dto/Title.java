package native_jdbc_programming.dto;

public class Title {
	private int tNo;
	private String tName;
	public Title() {
		  
	}
	
	//alt shift s - field
	public Title(int tNo) {
		super();
		this.tNo = tNo;
	}

	public Title(int tNo, String tName) {
		super();
		this.tNo = tNo;
		this.tName = tName;
	}

	
	
	public int getNo() {
		return tNo;
	}
	public void setNo(int tNo) {
		this.tNo = tNo;
	}
	public String getName() {
		return tName;
	}
	public void setName(String tName) {
		this.tName = tName;
	}
	@Override
	public String toString() {
		return String.format("Title [tNo=%s, tName=%s]", tNo, tName);
	}

}
