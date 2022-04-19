/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Apr 12, 2022
**/
package dmacc.loggingin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author jake
 *
 */
public interface LoginRepository extends JpaRepository<Login, Long>{
	@Query(value = "Select * from login a where a.username = :username and a.password = :password", nativeQuery = true)
	List<Login> findLoginByUsernameAndPassword(String username, String password);
}
