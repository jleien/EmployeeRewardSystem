/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Apr 12, 2022
**/
package dmacc.loggingin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author jake
 *
 */
public interface LoginRepository extends JpaRepository<Login, Long>{
	@Query(value = "Select * from login", nativeQuery=true)
	private List<Object> getValues() {
		return null;
	}
}
