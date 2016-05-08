package com.ssh.sys.po;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.alibaba.fastjson.annotation.JSONField;
@Entity
@Table(name="SYS_USERROLE")
public class UserRole {

	@Id
	@Column(name="USERROLEID")
	/*@GenericGenerator(name="hibernate-uuid", strategy="uuid")  
    @GeneratedValue(generator="hibernate-uuid")*/  
	private String userRoleId;
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="userId")
	@JSONField(serialize=false)
	private UserInfo userInfo;
	
	@ManyToOne
	@JoinColumn(name="roleId")
	@JSONField(serialize=false)
	private RoleInfo roleInfo;
	
	
	public String getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public RoleInfo getRoleInfo() {
		return roleInfo;
	}
	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}
	
	
}
