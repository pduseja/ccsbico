package com.ccsbi.co.usermanagement.client.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Login")
@JacksonXmlRootElement(localName = "Login")
@SuppressWarnings("serial")
public class Login implements Serializable{


	@ApiModelProperty(name = "userName", value = "userName")
	@JsonProperty("userName")
	@JacksonXmlProperty(localName = "userName")
	private String userName;
	
	@ApiModelProperty(name = "password", value = "password")
	@JsonProperty("password")
	@JacksonXmlProperty(localName = "password") 
	private String password;
	
	@ApiModelProperty(name = "rememberMe", value = "rememberMe")
	@JsonProperty("rememberMe")
	@JacksonXmlProperty(localName = "rememberMe") 
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
