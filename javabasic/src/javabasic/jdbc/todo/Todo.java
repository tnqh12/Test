package javabasic.jdbc.todo;

import java.sql.Timestamp;

public class Todo {
	
	private int tdid;
	private String tdcontent;
	private String tdcomplete;
	private Timestamp tdrefdate;

	public Todo() {
	}

	public int getTdid() {
		return tdid;
	}

	public void setTdid(int tdid) {
		this.tdid = tdid;
	}

	public String getTdcontent() {
		return tdcontent;
	}

	public void setTdcontent(String tdcontent) {
		this.tdcontent = tdcontent;
	}

	public String getTdcomplete() {
		return tdcomplete;
	}

	public void setTdcomplete(String tdcomplete) {
		this.tdcomplete = tdcomplete;
	}

	public Timestamp getTdrefdate() {
		return tdrefdate;
	}

	public void setTdrefdate(Timestamp tdrefdate) {
		this.tdrefdate = tdrefdate;
	}

	@Override
	public String toString() {
		return "Todo [tdid=" + tdid + ", tdcontent=" + tdcontent + ", tdcomplete=" + tdcomplete + ", tdrefdate="
				+ tdrefdate + "]";
	}

	public Todo(int tdid, String tdcontent, String tdcomplete, Timestamp tdrefdate) {
		super();
		this.tdid = tdid;
		this.tdcontent = tdcontent;
		this.tdcomplete = tdcomplete;
		this.tdrefdate = tdrefdate;
	}
	
	
	
	
}

