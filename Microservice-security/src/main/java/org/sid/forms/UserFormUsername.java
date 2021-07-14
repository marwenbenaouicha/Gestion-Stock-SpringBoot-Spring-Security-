package org.sid.forms;

import lombok.Data;

@Data
public class UserFormUsername{

    public UserFormUsername(String newUserName, String lastUserName) {
		super();
		this.newUserName = newUserName;
		this.lastUserName = lastUserName;
	}
	public String getNewUserName() {
		return newUserName;
	}
	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
	}
	public String getLastUserName() {
		return lastUserName;
	}
	public void setLastUserName(String lastUserName) {
		this.lastUserName = lastUserName;
	}
	private String newUserName;
    private String lastUserName;

}
