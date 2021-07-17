/**
 * 
 */
package com.ibs.airaidermasterdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ibs.airaidermasterdataservice.entity.AirportEntity;

/**
 * @author 91940
 * Interface for Airport Repository extending JpaRepository
 */
@Repository
public interface AirportRepository extends JpaRepository<AirportEntity, Integer> {

	/**
	 * @param airportCode
	 * @return Airport Entity
	 */
	@Query("From AirportEntity where airportCode=:airportCode")
	AirportEntity findByAirportCode(@Param("airportCode") String airportCode);

	/**
	 * @param airportId
	 * @return Airport Entity
	 */
	@Query("From AirportEntity where airportId=:airportId")
	AirportEntity findByAirportId(@Param("airportId") int airportId);

}
