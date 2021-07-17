/**
 * 
 */
package com.ibs.airaidermasterdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ibs.airaidermasterdataservice.entity.CityEntity;

/**
 * @author 91940
 * Interface for City repository extending JpaRepository
 */
@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer> {

	/**
	 * @param cityCode
	 * @return CityEntity
	 */
	@Query("From CityEntity where cityCode=:cityCode")
	CityEntity findByCityCode(@Param("cityCode") String cityCode);

	/**
	 * @param cityId
	 * @return
	 */
	@Query("From CityEntity where cityId=:cityId")
	CityEntity findByCityId(@Param("cityId") int cityId);

}
