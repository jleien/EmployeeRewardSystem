/**
 * 
 */
package dmacc.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 12, 2022
 */
@Entity
public class AttendanceRecord {
	@Id
	@GeneratedValue
	private long id;
	private int employeeId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	private String timeIn;
	private String timeOut;
	
	public AttendanceRecord() {
		super();
	}
	public AttendanceRecord(int employeeId) {
		super();
		this.employeeId = employeeId;
	}
	public AttendanceRecord(int employeeId, LocalDate date) {
		super();
		this.employeeId = employeeId;
		this.date = date;
	}
	public AttendanceRecord(int employeeId, LocalDate date, String timeIn, String timeOut) {
		super();
		this.employeeId = employeeId;
		this.date = date;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
	}
	public AttendanceRecord(long id, int employeeId, LocalDate date, String timeIn, String timeOut) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.date = date;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
	}
	public long getId() {
		return id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public LocalDate getDate() {
		return date;
	}
	public String getTimeIn() {
		return timeIn;
	}
	public String getTimeOut() {
		return timeOut;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}
	
}
