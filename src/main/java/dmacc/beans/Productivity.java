package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Apr 11, 2022
 */
@Data
@NoArgsConstructor
@Entity
public class Productivity {
	@Id
	@GeneratedValue
	private long id;
	private String employeeId;
	private int contribution; //Numeral score for productivity output for the amount of hours an employee has worked
	private int hours; //Amount of hours contributed during bonus timeline
	
	public Productivity(long id, String empId, int cont, int hours) {
		super();
		this.id = id;
		this.employeeId = empId;
		this.contribution = cont;
		this.hours = hours;
	}
}
