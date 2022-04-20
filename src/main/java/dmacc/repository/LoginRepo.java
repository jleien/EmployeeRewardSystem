/**
 * 
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import dmacc.model.UserLogin;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 13, 2022
 */
@Repository
public interface LoginRepo extends JpaRepository<UserLogin, Long> { 
	@Query(value = "Select * from user_login a where a.username = :username and a.password = :password", nativeQuery = true)
	UserLogin findLoginByUsernameAndPassword(String username, String password);
}