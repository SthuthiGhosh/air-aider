/**
 * 
 */
package com.ibs.airaidermasterdataservice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.entity.AirportEntity;
import com.ibs.airaidermasterdataservice.repository.AirportDetailsRepository;
import com.ibs.airaidermasterdataservice.repository.AirportRepository;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author Sthuthi
 * Class for loading DB details
 *
 */
@Configuration
public class LoadDatabase implements CommandLineRunner {

	/**
	 * Bean injected for AirportRepository
	 */
	@Autowired
	private AirportRepository airportRepository;

	/**
	 * Bean injected for AirportRepository
	 */
	@Autowired
	private AirportDetailsRepository airportDetailsRepository;

	/*
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		AirportEntity airportEntity1 = new AirportEntity();
		airportEntity1.setAirportCode("AAA");
		airportEntity1.setActiveFlag(true);
		airportEntity1.setCreatedOn(LocalDate.now());
		airportEntity1.setUpdatedOn(LocalDate.now());
	
		AirportDetailsEntity airportDetailsEntity1 = new AirportDetailsEntity();
		airportDetailsEntity1.setAirportdDetailId(101);
		airportDetailsEntity1.setLangCode(LangCodes.EN);
		airportDetailsEntity1.setAirportName("Cochin");
		airportDetailsEntity1.setCreatedOn(LocalDate.now());
		airportDetailsEntity1.setUpdatedOn(LocalDate.now());
		
		AirportDetailsEntity airportDetailsEntity2 = new AirportDetailsEntity();
		airportDetailsEntity1.setAirportdDetailId(102);
		airportDetailsEntity2.setLangCode(LangCodes.JA);
		airportDetailsEntity2.setAirportName("Japanese");
		airportDetailsEntity2.setCreatedOn(LocalDate.now());
		airportDetailsEntity2.setUpdatedOn(LocalDate.now());

		List<AirportDetailsEntity> airportDetailsEntities=new ArrayList<>();
		airportDetailsEntities.add(airportDetailsEntity1);
		airportDetailsEntities.add(airportDetailsEntity2);
		airportEntity1.setAirportDetailsEntity(airportDetailsEntities);
		airportRepository.save(airportEntity1);
		
		
		AirportEntity airportEntity2 = new AirportEntity();
		airportEntity2.setAirportCode("BBB");
		airportEntity2.setActiveFlag(true);
		airportEntity2.setCreatedOn(LocalDate.now());
		airportEntity2.setUpdatedOn(LocalDate.now());
	
		AirportDetailsEntity airportDetailsEntity3 = new AirportDetailsEntity();
		airportDetailsEntity3.setAirportdDetailId(103);
		airportDetailsEntity3.setLangCode(LangCodes.EN);
		airportDetailsEntity3.setAirportName("Kannur");
		airportDetailsEntity3.setCreatedOn(LocalDate.now());
		airportDetailsEntity3.setUpdatedOn(LocalDate.now());
		
		AirportDetailsEntity airportDetailsEntity4 = new AirportDetailsEntity();
		airportDetailsEntity4.setAirportdDetailId(104);
		airportDetailsEntity4.setLangCode(LangCodes.JA);
		airportDetailsEntity4.setAirportName("Tokyo");
		airportDetailsEntity4.setCreatedOn(LocalDate.now());
		airportDetailsEntity4.setUpdatedOn(LocalDate.now());

		List<AirportDetailsEntity> airportDetailsEntities1=new ArrayList<>();
		airportDetailsEntities1.add(airportDetailsEntity1);
		airportDetailsEntities1.add(airportDetailsEntity2);
		airportEntity2.setAirportDetailsEntity(airportDetailsEntities1);
		airportRepository.save(airportEntity2);
		

// * 
// */
//package com.ibs.airaidermasterdataservice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
//import com.ibs.airaidermasterdataservice.entity.AirportEntity;
//import com.ibs.airaidermasterdataservice.entity.CityDetailsEntity;
//import com.ibs.airaidermasterdataservice.entity.CityEntity;
//import com.ibs.airaidermasterdataservice.repository.AirportDetailsRepository;
//import com.ibs.airaidermasterdataservice.repository.AirportRepository;
//import com.ibs.airaidermasterdataservice.repository.CityDetailsRepository;
//import com.ibs.airaidermasterdataservice.repository.CityRepository;
//import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;
//
///**
// * @author 91940
// *
// */
//@Configuration
//public class LoadDatabase implements CommandLineRunner {
//
//	@Autowired
//	private AirportRepository airportRepository;
//
//	@Autowired
//	private AirportDetailsRepository airportDetailsRepository;
//
//	@Autowired
//	private CityRepository cityRepository;
//
//	@Autowired
//	private CityDetailsRepository cityDetailsRepository;
//
//	/*
//	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
//	 */
//	@Override
//	public void run(String... args) throws Exception {
//
//		CityEntity city1 = new CityEntity(10, "BLS");
//		cityRepository.save(city1);
//		CityEntity city2 = new CityEntity(20, "BBSR");
//		cityRepository.save(city2);
//
//		CityDetailsEntity cityDeatils1 = new CityDetailsEntity(LangCodes.EN, "Balasore", city1);
//		cityDetailsRepository.save(cityDeatils1);
//		CityDetailsEntity cityDeatils2 = new CityDetailsEntity(LangCodes.JA, "Bhubaneshwar", city2);
//		cityDetailsRepository.save(cityDeatils2);
//
//		AirportEntity airport1 = new AirportEntity("BLS-1", city1);
//		airportRepository.save(airport1);
//		AirportEntity airport2 = new AirportEntity("BLS-2", city1);
//		airportRepository.save(airport2);
//		AirportEntity airport3 = new AirportEntity("BBSR-1", city2);
//		airportRepository.save(airport3);
//
//		AirportDetailsEntity airportDetails1 = new AirportDetailsEntity("BLS-AIR1", LangCodes.EN, airport1);
//		airportDetailsRepository.save(airportDetails1);
//		AirportDetailsEntity airportDetails2 = new AirportDetailsEntity("BLS-AIR2", LangCodes.EN, airport2);
//		airportDetailsRepository.save(airportDetails2);
//		AirportDetailsEntity airportDetails3 = new AirportDetailsEntity("BBSR-AIR1", LangCodes.JA, airport3);
//		airportDetailsRepository.save(airportDetails3);
//
	}
}
