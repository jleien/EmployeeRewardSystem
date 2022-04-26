/**
 * 
 */
package dmacc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dmacc.beans.Safety;
import dmacc.model.AttendanceRecord;
import dmacc.repository.AttendanceRepo;
import dmacc.repository.LoginRepo;
import dmacc.repository.ProductivityRepo;
import dmacc.repository.SafetyRepo;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 25, 2022
 */
@Controller
public class BonusWebController {
	@Autowired
	AttendanceRepo attendanceRepo;
	@Autowired
	SafetyRepo safetyRepo;
	@Autowired
	ProductivityRepo productivityRepo;
	
	@GetMapping("viewAllBonus")
	public String viewBonus(Model model) {
		return "viewBonus";
	}
	
	@GetMapping("viewAllBonusEmployee")
	public String viewBonusEmployee(Model model) {
		return "viewBonusEmployee";
	}
	
	@GetMapping("/enterBonus")
	public String enterBonusNumber(@RequestParam(name = "employeeNumber") String empNum, Model model) {
		String bonusMessage = "";
		System.out.println(empNum);
		List<AttendanceRecord> allAttendance = attendanceRepo.findAll();
		int count = 0;
		for (AttendanceRecord a : allAttendance) {
			if (String.valueOf(a.getEmployeeId()).equals(empNum)) {
				count = count + 1;
			}
		}
		
		float percentage = ((float) count) / 5;
		
		Boolean hasSafety = false;
		List<Safety> allSafety = safetyRepo.findAll();
		for (Safety s : allSafety) {
			if (s.getEmployeeId().equals(empNum)) {
				hasSafety = true;
			}
		}
		if (count == 0) {
			bonusMessage = "No attendance records found";
			model.addAttribute("bonusMessage", bonusMessage);
			model.addAttribute("bonusAmount", "$0.00");
			return "viewBonus";
		}
		if (hasSafety == false) {
			float bonusAmount = percentage * 10000;
			System.out.println(bonusAmount);
			bonusMessage = "Eligable for bonus";
			model.addAttribute("bonusMessage", bonusMessage);
			model.addAttribute("bonusAmount", "$" + String.valueOf(bonusAmount) + "0");
			return "viewBonus";
		}else {
			bonusMessage = "Not eligable for bonus";
			model.addAttribute("bonusMessage", bonusMessage);
			model.addAttribute("bonusAmount", "$0.00");
			return "viewBonus";
		}
		
	}
	
	@GetMapping("/enterBonusEmployee")
	public String enterBonusNumberEmployee(@RequestParam(name = "employeeNumber") String empNum, Model model) {
		String bonusMessage = "";
		System.out.println(empNum);
		List<AttendanceRecord> allAttendance = attendanceRepo.findAll();
		int count = 0;
		for (AttendanceRecord a : allAttendance) {
			if (String.valueOf(a.getEmployeeId()).equals(empNum)) {
				count = count + 1;
			}
		}
		
		float percentage = ((float) count) / 5;
		
		Boolean hasSafety = false;
		List<Safety> allSafety = safetyRepo.findAll();
		for (Safety s : allSafety) {
			if (s.getEmployeeId().equals(empNum)) {
				hasSafety = true;
			}
		}
		if (count == 0) {
			bonusMessage = "No attendance records found";
			model.addAttribute("bonusMessage", bonusMessage);
			model.addAttribute("bonusAmount", "$0.00");
			return "viewBonusEmployee";
		}
		if (hasSafety == false) {
			float bonusAmount = percentage * 10000;
			System.out.println(bonusAmount);
			bonusMessage = "Eligable for bonus";
			model.addAttribute("bonusMessage", bonusMessage);
			model.addAttribute("bonusAmount", "$" + String.valueOf(bonusAmount) + "0");
			return "viewBonusEmployee";
		}else {
			bonusMessage = "Not eligable for bonus";
			model.addAttribute("bonusMessage", bonusMessage);
			model.addAttribute("bonusAmount", "$0.00");
			return "viewBonusEmployee";
		}
		
	}

}
