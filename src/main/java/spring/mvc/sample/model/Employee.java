package spring.mvc.sample.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
	@NotEmpty
	private String employeeNo;
	@NotEmpty
	private String employeeName;
	@NotEmpty
	@DateTimeFormat
	private String birthday;
	@NotEmpty
	private String sex;
	private String sexView;
	@NotEmpty
	private String tel;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private String address;
	@NotEmpty
	@DateTimeFormat
	private String employementDate;
	@NotEmpty
	private String rankId;
	@NotEmpty
	private String positionId;
	@NotEmpty
	private String workPatternId;

	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmployementDate() {
		return employementDate;
	}
	public void setEmployementDate(String employementDate) {
		this.employementDate = employementDate;
	}
	public String getRankId() {
		return rankId;
	}
	public void setRankId(String rankId) {
		this.rankId = rankId;
	}
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getWorkPatternId() {
		return workPatternId;
	}
	public void setWorkPatternId(String workPatternId) {
		this.workPatternId = workPatternId;
	}

}
