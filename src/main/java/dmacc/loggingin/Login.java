/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Apr 12, 2022
**/
package dmacc.loggingin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jake
 *
 */
@Entity
public class Login {
	@Id
	@GeneratedValue
	private Long ID;
	private String username;
	private String password;
	
	public Login() {
		super();
	}

	public Login(String username, String password) {
		setUsername(username);
		setPassword(password);
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
}
