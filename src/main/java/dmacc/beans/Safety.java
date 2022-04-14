package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Apr 11, 2022
 */
@Data
@NoArgsConstructor
@Entity
public class Safety {
	@Id
	@GeneratedValue
	private long id;
	private String employeeId;
	private int incidents; //Count for amount of saftey incidents for each employee
	private String notes; //gives managers the ability to make comments on saftey incidents
	
	public Safety(long id, String empId, int incidents, String notes) {
		super();
		this.id = id;
		this.employeeId = empId;
		this.incidents = incidents;
		this.notes = notes;
	}
}
