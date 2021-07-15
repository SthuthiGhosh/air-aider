/**
 * 
 */
package com.ibs.airaidermasterdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.airaidermasterdataservice.entity.CityEntity;

/**
 * @author 91940
 *
 */
@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer>{

}
