package com.ybase.vo;

import javax.persistence.*;

@Entity(name = "t_user")
public class DrUser {

	public DrUser() {
		super();
	}

	/** 编号 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	/** 密码 */
	@Column(name = "passwd", length = 40)
	private String passwd;

	/** 名称 */
	@Column(name = "name", length = 40)
	private String name;

	/** 邮箱 */
	@Column(name = "email", length = 50)
	private String email;

	/** 电话 */
	@Column(name = "phone", length = 20)
	private String phone;

	/** 联系地址 */
	@Column(name = "address", length = 200)
	private String address;

	/** 访问系统次数 */
	@Column(name = "visit", precision = 10, scale = 0)
	private Integer visit;

	/** 账号状态 0:未登录 1:已登录 2:停用 */
	@Column(name = "status", precision = 10, scale = 0)
	private Integer status;

	/** 系统角色 admin-管理员 */
	@Column(name = "role", length = 10)
	private String role;

	/** 最后登录系统日期 */
	@Column(name = "logindate", length = 8)
	private String loginDate;

	/** 最后登录系统时间 */
	@Column(name = "logintime", length = 9)
	private String loginTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getVisit() {
		return visit;
	}

	public void setVisit(Integer visit) {
		this.visit = visit;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}

	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
}
