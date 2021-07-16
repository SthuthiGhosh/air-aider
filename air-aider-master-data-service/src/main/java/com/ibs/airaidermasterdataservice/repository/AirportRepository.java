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
 *
 */
@Repository
public interface AirportRepository extends JpaRepository<AirportEntity, Integer> {

	/**
	 * @param airportCode
	 * @return
	 */
	@Query("From AirportEntity where airportCode=:airportCode")
	AirportEntity findByAirportCode(@Param("airportCode") String airportCode);

	/**
	 * @param airportCode
	 * @return
	 */
	

//	SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate
//	FROM Orders
//	INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID;

}
