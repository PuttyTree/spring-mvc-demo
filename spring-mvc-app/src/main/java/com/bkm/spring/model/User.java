package com.bkm.spring.model;

import java.util.Date;

public class User {

	private int id = -1;
	private String name;
	private String phone;
	private String email;
	private String pwd;
	private String pwdSalt;
	private Date createTime;
	private Date modifyTime;
	private Short delete;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwdSalt() {
		return pwdSalt;
	}

	public void setPwdSalt(String pwdSalt) {
		this.pwdSalt = pwdSalt;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Short getDelete() {
		return delete;
	}

	public void setDelete(Short delete) {
		this.delete = delete;
	}

	@Override
	public String toString() {

		final StringBuilder sb = new StringBuilder("User{");
		sb.append("id=").append(id);
		sb.append(",phone=").append(phone);
		sb.append(",email=").append(email);
		sb.append(",pwd=").append(pwd);
		sb.append(",pwdSalt=").append(pwdSalt);
		sb.append(",createTime=").append(createTime);
		sb.append(",modifyTime=").append(modifyTime);
		sb.append(",delete=").append(delete);
		sb.append("}");

		return sb.toString();
	}
}
