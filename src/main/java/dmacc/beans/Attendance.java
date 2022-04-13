/**
 * @authorchrisg - Cgeralds
 * CIS175-Fall2022
 * Apr 12, 2022
 */
package dmacc.beans;

/**
 * @author chrisg
 *
 */
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@Embeddable
public class Attendance {
	private LocalDate date;
	private LocalTime clockIn;
	private LocalTime clockOut;
	

}
