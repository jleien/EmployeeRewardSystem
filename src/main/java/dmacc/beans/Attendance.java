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
import javax.persistence.Embeddable;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@Embeddable
public class Attendance {
	@Autowired 
	//TODO add employee name and ID num from employee table
	private char attendance;  // Char will be either (y)es or (n)o. Yes also encompassed any type of excused absence. 
	

}
