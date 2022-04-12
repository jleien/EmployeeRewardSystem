/**
 * 
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.model.AttendanceRecord;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Apr 12, 2022
 */

@Repository
public interface AttendanceRepo extends JpaRepository<AttendanceRecord, Long> { }
