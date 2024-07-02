package spring.mvc.sample.model;

import org.hibernate.validator.constraints.NotEmpty;

public class UserInfo {
	@NotEmpty
	private String userId;
	@NotEmpty
	private String userName;
	private String sex;
	private String sexView;
	private String birthday;
	private String address;
	private String telephone;
	private String mail;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
		this.sexView = (sex.equals("0") ? "男" : "女");
	}
	public String getSexView() {
		return sexView;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
