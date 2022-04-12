package dmacc;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dmacc.model.AttendanceRecord;
import dmacc.repository.AttendanceRepo;

@SpringBootApplication
public class EmployeeRewardSystemApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeRewardSystemApplication.class, args);
	}
	
}
