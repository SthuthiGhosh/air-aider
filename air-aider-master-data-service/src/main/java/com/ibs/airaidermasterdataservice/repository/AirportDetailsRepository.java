/**
 * 
 */
package com.ibs.airaidermasterdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;

/**
 * @author 91940
 *
 */
@Repository
public interface AirportDetailsRepository extends JpaRepository<AirportDetailsEntity, Integer> {

	
//	AirportDetailsEntity getAirportDetails();
	
}
