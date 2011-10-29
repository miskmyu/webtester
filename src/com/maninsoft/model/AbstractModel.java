package com.maninsoft.model;

import java.util.Date;

import com.maninsoft.modelUtil.XmlConverter;

public class AbstractModel extends ConstantModel {
	public static final String A_CREATEDATE = "createDate";
	public static final String A_CREATEUSER = "createUser";
	public static final String A_MODIFYDATE = "modifyDate";
	public static final String A_MODIFYUSER = "modifyUser";
	public static final String E_DESCRIPTION = "description";
	
	private Date createDate = null;
	private String createUser = null;
	private Date modifyDate = null;
	private String modifyUser = null;
	private String description = null;
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String toString() {
		try {
			return XmlConverter.modelToXml(this);
		} catch (Exception e) {
			return null;
		}
	}
}
