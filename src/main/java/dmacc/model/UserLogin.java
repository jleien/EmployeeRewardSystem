/**
 * 
 */
package dmacc.model;

import javax.persistence.*;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 13, 2022
 */
@Entity
public class UserLogin {
	@Id
	@GeneratedValue
	long id;
	String username;
	String password;
	
	public UserLogin() {
		super();
	}
	
	public UserLogin(long id, String user, String pass) {
		this.id = id;
		this.username = user;
		this.password = pass;
	}

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
