/**
 * 
 */
package dmacc.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.model.AttendanceRecord;
import dmacc.repository.AttendanceRepo;
import dmacc.repository.ProductivityRepo;
import dmacc.repository.SafetyRepo;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 12, 2022
 */
@Controller
public class EmployeeWebController {
	@Autowired
	AttendanceRepo attendanceRepo;
	@Autowired
	ProductivityRepo productivityRepo;
	@Autowired
	SafetyRepo safetyRepo;
	
	@GetMapping("/employeeView")
	public String employeeView(Model model) {
		return "employee";
	}
	
	@GetMapping("viewAllAttendance")
	public String viewAttendance(Model model) {
		if(attendanceRepo.findAll().isEmpty()) {
			return employeeView(model);
		}
		
		model.addAttribute("records", attendanceRepo.findAll());
		return "viewAttendance";
	}
	
	@GetMapping("viewAllProductivity")
	public String viewProductivity(Model model) {
		if(productivityRepo.findAll().isEmpty()) {
			return employeeView(model);
		}
		
		model.addAttribute("records", productivityRepo.findAll());
		return "viewProductivity";
	}
	
	@GetMapping("viewAllSafety")
	public String viewSafety(Model model) {
		if (safetyRepo.findAll().isEmpty()) {
			return employeeView(model);
		}
		
		model.addAttribute("records", safetyRepo.findAll());
		return "viewSafety";
	}
	
	@GetMapping("viewBonus")
	public String viewBonus(Model model) {
		// Logic to determine bonus
		//		Pull data from attendance repo, safety repo, and productivity repo
		//		Calculate eligibility
		
		return "viewBonus";
	}
	
	@GetMapping("home")
	public String homePage(Model model) {
		return "../static/index";
	}

}
