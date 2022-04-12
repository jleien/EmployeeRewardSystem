package dmacc.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Apr 11, 2022
 */
@Data
@NoArgsConstructor
public class Productivity {
	private int contribution; //Numeral score for productivity output for the amount of hours an employee has worked
	private int hours; //Amount of hours contributed during bonus timeline
}
