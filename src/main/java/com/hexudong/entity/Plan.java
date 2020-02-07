package com.hexudong.entity;

public class Plan {
	
	private Integer pid         ;
	private String pname       ;
	private String amount      ;//投资金额
	private String manager     ;//分管领导
	private String content     ;//投资说明
	private Integer did         ;//对应的部门id
	
	private String dname;		//部门的别称
	
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Plan [pid=" + pid + ", pname=" + pname + ", amount=" + amount + ", manager=" + manager + ", content="
				+ content + ", did=" + did + "]";
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Plan(Integer pid, String pname, String amount, String manager, String content, Integer did) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
		this.manager = manager;
		this.content = content;
		this.did = did;
	}
	public Plan() {
		super();
	}
	
	
}
