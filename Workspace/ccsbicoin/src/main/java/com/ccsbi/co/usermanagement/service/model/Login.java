package com.ccsbi.co.usermanagement.service.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Login implements Serializable{

	private String userName;
	
	private String password;
	
	private String rememberMe;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the rememberMe
	 */
	public String getRememberMe() {
		return rememberMe;
	}

	/**
	 * @param rememberMe the rememberMe to set
	 */
	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
	}
}
