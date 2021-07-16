/**
 * 
 */
package com.ibs.airaidermasterdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.airaidermasterdataservice.entity.CityDetailsEntity;

/**
 * @author 91940
 *Interface for City Details Repository extending JpaRepository
 */
@Repository
public interface CityDetailsRepository extends JpaRepository<CityDetailsEntity, Integer> {

}
