
package com.ibs.airaidermasterdataservice.repository;
//
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//
import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
//
///**
// * @author 91940
// *
// */

@Repository
public interface AirportDetailsRepository extends JpaRepository<AirportDetailsEntity, Integer> {

	/**
	 * @param airportCode
	 * @return
	 */
//
//	/**
//	 * @param airportId
//	 * @return
//	 */
////	AirportDetailsEntity findByAirportId(int airportId);
//
//	/**
//	 * @param airportCode
//	 * @return
//	 */
////	AirportDetailsEntity getAirportDetails();
//
//	@Query("From AirportDetailsEntity where airportCode=:d\"")
//	AirportDetailsEntity findAirportDetailsRepository(@Param("d") String airportCode);
//
}
