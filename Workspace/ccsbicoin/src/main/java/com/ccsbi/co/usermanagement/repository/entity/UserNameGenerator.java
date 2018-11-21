package com.ccsbi.co.usermanagement.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity(name = "UserNameGenerator")
public class UserNameGenerator implements Serializable {

	@Id
	@Column(name = "Id")
	private int Id;
	
	@Column(name="Prefix")
	private String prefix;
	
	@Column(name="UserIDNumber")
	private int userIDNumber;
	
	@Column(name="EntityIDNumber")
	private String entityIDNumber;

	/**
	 * @return the Id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the Id to set
	 */
	public void setId(int Id) {
		this.Id = Id;
	}
	
	
}
