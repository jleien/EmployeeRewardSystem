/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Apr 13, 2022
**/
package dmacc.loggingin;

import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author jake
 *
 */
@Controller
public class LoginController {
	@Autowired
	LoginRepository repo;
	
	@GetMapping("viewAllLogin")
	public String viewAll(Model model){
		Login employee1 = new Login ("employee1", "password1");
		repo.save(employee1);
		return "testlogin";
	}
	
	@GetMapping("/inputLogin")
	public String addNewLogin(Model model) {
		Login l = new Login();
		model.addAttribute("newLogin", l);
		return "input";
	}

	@PostMapping("/inputLogin")
	public String addNewLogin(@ModelAttribute Login l, Model model) {
		// needs to contain logic for checking database for correct login
		// receive object from html and check against database
		// return case statement based on login to redirect to correct site view
		int role = 0;
		
		if (l.getUsername().equals("employee")) {
			role = 1;
			}
			else if (l.getUsername().equals("manager")) {
				role = 2;
			}
			else if (l.getUsername().equals("finmanager")) {
				role = 3;
			}
			else if (l.getUsername().equals("HR")) {
				role = 4;
			}
			else {
				role = 0;
				System.out.println("Invalid Role");
			}
		
		switch (role) {
		case 1:
			// send to employee
			break;
		case 2:
			// send to manager
			break;
		case 3:
			// send to finance
			break;
		case 4:
			// send to hr
			break;
		}
		return null;
	}

}
