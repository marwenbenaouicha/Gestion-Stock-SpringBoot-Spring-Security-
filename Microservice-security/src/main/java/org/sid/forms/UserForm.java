package org.sid.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.entities.AppRole;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserForm{

    public UserForm(String username, String password, String confirmedPassword, boolean actived,
			ArrayList<AppRole> roles) {
		super();
		this.username = username;
		this.password = password;
		this.confirmedPassword = confirmedPassword;
		this.actived = actived;
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmedPassword() {
		return confirmedPassword;
	}

	public void setConfirmedPassword(String confirmedPassword) {
		this.confirmedPassword = confirmedPassword;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	public ArrayList<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<AppRole> roles) {
		this.roles = roles;
	}

	private String username;
    private String password;
    private String confirmedPassword;
    private boolean actived;
    private ArrayList<AppRole> roles;

    public UserForm(String username, String password, String confirmedPassword){

        this.username=username;
        this.password=password;
        this.confirmedPassword=confirmedPassword;
    }

}
