/**
 * 
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import dmacc.model.UserLogin;
import dmacc.repository.AttendanceRepo;
import dmacc.repository.LoginRepo;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 13, 2022
 */
@Controller
public class LoginWebController {
	@Autowired
	LoginRepo loginRepo;
	@Autowired
	AttendanceRepo attendanceRepo;
	
	@GetMapping("login")
	public String loginPage(Model model) {
//		UserLogin employeeLogin = new UserLogin(1, "employee", "password");
//		UserLogin managerLogin = new UserLogin(2, "manager", "password");
//		loginRepo.save(employeeLogin);
//		loginRepo.save(managerLogin);
		
		UserLogin login = new UserLogin();
		model.addAttribute("UserLogin", login);
		
		return "login";
	}
	
	@GetMapping("/loginUser")
	public String loginUser(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password, Model model) {
		if (username.equals("employee") && password.equals("password")) {
			return "employee";
		}else if (username.equals("manager") && password.equals("password")) {
			return "manager";
		}
		
		return loginPage(model);
	}

}
