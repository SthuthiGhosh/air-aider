/**
 * 
 */
package com.ibs.airaidermasterdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.airaidermasterdataservice.entity.AirportEntity;

/**
 * @author 91940
 *
 */
@Repository
public interface AirportRepository extends JpaRepository<AirportEntity, Integer>{

	/**
	 * @param airportCode
	 * @return
	 */
	AirportEntity findByAirportCode(String airportCode);

}
