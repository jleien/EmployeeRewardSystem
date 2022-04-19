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

import dmacc.beans.Productivity;
import dmacc.beans.Safety;
import dmacc.model.AttendanceRecord;
import dmacc.repository.AttendanceRepo;
import dmacc.repository.ProductivityRepo;
import dmacc.repository.SafetyRepo;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 13, 2022
 */
@Controller
public class ManagerWebController {
	@Autowired
	AttendanceRepo attendanceRepo;
	@Autowired
	ProductivityRepo productivityRepo;
	@Autowired
	SafetyRepo safetyRepo;
	
	@GetMapping("/managerView")
	public String managerView(Model model) {
		return "manager";
	}
	
	// Attendance
	
	@GetMapping("manageAllAttendance")
	public String editAttendance(Model model) {
		if (attendanceRepo.findAll().equals(null)) {
			return managerView(model);
		}
		model.addAttribute("records", attendanceRepo.findAll());
		return "editViewAttendance";
	}
	
	@GetMapping("/inputAttendance")
	public String addNewAttendanceRecord(Model model) {
		AttendanceRecord record = new AttendanceRecord();
		model.addAttribute("newRecord", record);
		return "inputAttendance";
	}
	
	@PostMapping("/updateAttendance/{id}")
	public String reviseAttendanceRecord(AttendanceRecord record, Model model) {
		attendanceRepo.save(record);
		return editAttendance(model);
	}
	
	@GetMapping("/editAttendance/{id}")
	public String showUpdateAttendanceRecord(@PathVariable("id") long id, Model model) {
		AttendanceRecord record = attendanceRepo.findById(id).orElse(null);
		model.addAttribute("newRecord", record);
		return "inputAttendance";
	}
	
	@GetMapping("/deleteAttendance/{id}")
	public String deleteAttendanceRecord(@PathVariable("id") long id, Model model) {
		AttendanceRecord record = attendanceRepo.findById(id).orElse(null);
		attendanceRepo.delete(record);
		return editAttendance(model);
	}
	
	// Productivity
	
	@GetMapping("manageAllProductivity")
	public String editProductivity(Model model) {
		if (productivityRepo.findAll().equals(null)) {
			return managerView(model);
		}
		
		model.addAttribute("records", productivityRepo.findAll());
		return "editViewProductivity";
	}
	
	@GetMapping("/inputProductivity")
	public String addNewProductivityRecord(Model model) {
		Productivity record = new Productivity();
		model.addAttribute("newRecord", record);
		return "inputProductivity";
	}
	
	@PostMapping("/updateProductivity/{id}")
	public String reviseProductivityRecord(Productivity record, Model model) {
		productivityRepo.save(record);
		return editProductivity(model);
	}
	
	@GetMapping("/editProductivity/{id}")
	public String showUpdateProductivityRecord(@PathVariable("id") long id, Model model) {
		Productivity record = productivityRepo.findById(id).orElse(null);
		model.addAttribute("newRecord", record);
		return "inputProductivity";
	}
	
	@GetMapping("/deleteProductivity/{id}")
	public String deleteProductivityRecord(@PathVariable("id") long id, Model model) {
		Productivity record = productivityRepo.findById(id).orElse(null);
		productivityRepo.delete(record);
		return editProductivity(model);
	}
	
	// Safety
	
	@GetMapping("manageAllSafety")
	public String editSafety(Model model) {
		if (safetyRepo.findAll().equals(null)) {
			return managerView(model);
		}
		
		model.addAttribute("records", safetyRepo.findAll());
		return "editViewSafety";
	}
	
	@GetMapping("/inputSafety")
	public String addNewSafetyRecord(Model model) {
		Safety record = new Safety();
		model.addAttribute("newRecord", record);
		return "inputSafety";
	}
	
	@PostMapping("/updateSafety/{id}")
	public String reviseSafetyRecord(Safety record, Model model) {
		safetyRepo.save(record);
		return editSafety(model);
	}
	
	@GetMapping("/editSafety/{id}")
	public String showUpdateSafetyRecord(@PathVariable("id") long id, Model model) {
		Safety record = safetyRepo.findById(id).orElse(null);
		model.addAttribute("newRecord", record);
		return "inputSafety";
	}
	
	@GetMapping("/deleteSafety/{id}")
	public String deleteSafetyRecord(@PathVariable("id") long id, Model model) {
		Safety record = safetyRepo.findById(id).orElse(null);
		safetyRepo.delete(record);
		return editSafety(model);
	}
	
}
