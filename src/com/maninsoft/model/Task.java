package com.maninsoft.model;


public class Task extends AbstractModel {
	
	public static final String A_TASKID = "taskId";
	public static final String E_TASKNAME = "taskName";
	public static final String A_TASKDEF = "taskDef";
	public static final String A_TASKASSIGNEE = "taskAssignee";
	public static final String E_TASKDOC = "taskDoc";
	public static final String E_TASKDESC = "taskDesc";
	public static final String A_ISNEW = "isNew";
	public static final String A_NUM = "num";
	public static final String A_FLONUM = "floNum";
	public static final String A_LONGNUM = "longNum";
	public static final String A_DOUBLENUM = "doubleNum";
	public static final String A_SHORTNUM = "shortNum";
	public static final String A_CHARSTR = "charStr";
	
	
	private String taskId = null;
	private String taskName = null;
	private String taskDef = null;
	private String taskAssignee = null;
	private String taskDoc = null;
	private String taskDesc = null;
	private boolean isNew = false;
	private int num = 0;
	private float floNum = 0;
	private long longNum = 0;
	private double doubleNum = 0;
	private short shortNum = 0;
	private char charStr = "a".charAt(0);

	public long getLongNum() {
		return longNum;
	}
	public void setLongNum(long longNum) {
		this.longNum = longNum;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public float getFloNum() {
		return floNum;
	}
	public void setFloNum(float floNum) {
		this.floNum = floNum;
	}
	public double getDoubleNum() {
		return doubleNum;
	}
	public void setDoubleNum(double doubleNum) {
		this.doubleNum = doubleNum;
	}
	public short getShortNum() {
		return shortNum;
	}
	public void setShortNum(short shortNum) {
		this.shortNum = shortNum;
	}
	public char getCharStr() {
		return charStr;
	}
	public void setCharStr(char charStr) {
		this.charStr = charStr;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDef() {
		return taskDef;
	}
	public void setTaskDef(String taskDef) {
		this.taskDef = taskDef;
	}
	public String getTaskAssignee() {
		return taskAssignee;
	}
	public void setTaskAssignee(String taskAssignee) {
		this.taskAssignee = taskAssignee;
	}
	public String getTaskDoc() {
		return taskDoc;
	}
	public void setTaskDoc(String taskDoc) {
		this.taskDoc = taskDoc;
	}
	public String getTaskDesc() {
		return taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}
	
}
