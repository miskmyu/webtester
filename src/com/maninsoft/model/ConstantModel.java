package com.maninsoft.model;

public class ConstantModel {

	protected final String RN = "\r\n";
	public static final String CDATA_OPEN = "<![CDATA[";
	public static final String CDATA_CLOSE = "]]>";
	public static final String E_GROUPID = "groupId";
	
	private String groupId  = null;

	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
}
