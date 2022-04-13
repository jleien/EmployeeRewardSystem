/**
 * 
 */
package dmacc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.repository.AttendanceRepo;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 12, 2022
 */
@Controller
public class EmployeeWebController {
	@Autowired
	AttendanceRepo attendenceRepo;
	
	
	@GetMapping("viewAllAttendance")
	public String viewAll(Model model) {
		if(attendenceRepo.findAll().isEmpty()) {
			return "../static/index";
		}
		
		model.addAttribute("records", attendenceRepo.findAll());
		return "viewAttendance";
	}

}
