package asg_2;

public class ResultList {
	

	private String num;
	private String name;
	private String fieldID;
	private String fed;
	private String rtg;
	private String cc;
	
	public ResultList() {
		super();	
	}

	public ResultList(String num, String name, String fieldID, String fed, String rtg, String cc) {
		super();
		this.num = num;
		this.name = name;
		this.fieldID = fieldID;
		this.fed = fed;
		this.rtg = rtg;
		this.cc = cc;
	}
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFieldID() {
		return fieldID;
	}

	public void setFieldID(String fieldID) {
		this.fieldID = fieldID;
	}

	public String getFed() {
		return fed;
	}

	public void setFed(String fed) {
		this.fed = fed;
	}

	public String getRtg() {
		return rtg;
	}

	public void setRtg(String rtg) {
		this.rtg = rtg;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}
	
}

