/**
 * 
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.model.AttendanceRecord;
import dmacc.model.UserLogin;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 13, 2022
 */
@Repository
public interface LoginRepo extends JpaRepository<UserLogin, Long> { }