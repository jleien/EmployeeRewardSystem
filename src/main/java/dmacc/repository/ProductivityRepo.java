/**
 * 
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Productivity;
import dmacc.model.AttendanceRecord;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 13, 2022
 */
@Repository
public interface ProductivityRepo extends JpaRepository<Productivity, Long> { }