package javabasic.jdbc;

public class BankAccont {
	
	private int baid;
	private String baname;
	private int bamoney;
	public int getBaid() {
		return baid;
	}
	public void setBaid(int baid) {
		this.baid = baid;
	}
	public String getBaname() {
		return baname;
	}
	public void setBaname(String baname) {
		this.baname = baname;
	}
	public int getBamoney() {
		return bamoney;
	}
	public void setBamoney(int bamoney) {
		this.bamoney = bamoney;
	}
	@Override
	public String toString() {
		return "BankAccont [baid=" + baid + ", baname=" + baname + ", bamoney=" + bamoney + "]";
	}
	public BankAccont(int baid, String baname, int bamoney) {
		super();
		this.baid = baid;
		this.baname = baname;
		this.bamoney = bamoney;
	}

	
	
	
	
	
	
	
}
