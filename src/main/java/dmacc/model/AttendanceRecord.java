/**
 * 
 */
package dmacc.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

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
	private LocalDate date;
	private LocalTime timeIn;
	private LocalTime timeOut;
	
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
	public AttendanceRecord(int employeeId, LocalDate date, LocalTime timeIn, LocalTime timeOut) {
		super();
		this.employeeId = employeeId;
		this.date = date;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
	}
	public AttendanceRecord(long id, int employeeId, LocalDate date, LocalTime timeIn, LocalTime timeOut) {
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
	public LocalTime getTimeIn() {
		return timeIn;
	}
	public LocalTime getTimeOut() {
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
	public void setTimeIn(LocalTime timeIn) {
		this.timeIn = timeIn;
	}
	public void setTimeOut(LocalTime timeOut) {
		this.timeOut = timeOut;
	}
	
}
