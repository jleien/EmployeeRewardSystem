package dmacc.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Apr 11, 2022
 */
@Data
@NoArgsConstructor
public class Saftey {
	private int incidents; //Count for amount of saftey incidents for each employee
	private String notes; //gives managers the ability to make comments on saftey incidents
	
}
