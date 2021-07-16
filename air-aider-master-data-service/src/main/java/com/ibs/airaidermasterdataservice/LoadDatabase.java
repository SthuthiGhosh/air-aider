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
import com.ibs.airaidermasterdataservice.entity.CityDetailsEntity;
import com.ibs.airaidermasterdataservice.entity.CityEntity;
import com.ibs.airaidermasterdataservice.repository.AirportRepository;
import com.ibs.airaidermasterdataservice.repository.CityRepository;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author Sthuthi Class for loading DB details
 *
 */
@Configuration
public class LoadDatabase implements CommandLineRunner {

	/**
	 * Bean injected for AirportRepository
	 */
	@Autowired
	private AirportRepository airportRepository;

	@Autowired
	private CityRepository cityRepository;
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
		airportDetailsEntity2.setAirportdDetailId(102);
		airportDetailsEntity2.setLangCode(LangCodes.JA);
		airportDetailsEntity2.setAirportName("Japanese");
		airportDetailsEntity2.setCreatedOn(LocalDate.now());
		airportDetailsEntity2.setUpdatedOn(LocalDate.now());

		List<AirportDetailsEntity> airportDetailsEntities = new ArrayList<>();
		airportDetailsEntities.add(airportDetailsEntity1);
		airportDetailsEntities.add(airportDetailsEntity2);
		airportEntity1.setAirportDetailsEntity(airportDetailsEntities);
//		airportRepository.save(airportEntity1);

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

		List<AirportDetailsEntity> airportDetailsEntities1 = new ArrayList<>();
		airportDetailsEntities1.add(airportDetailsEntity3);
		airportDetailsEntities1.add(airportDetailsEntity4);
		airportEntity2.setAirportDetailsEntity(airportDetailsEntities1);
//		airportRepository.save(airportEntity2);

		List<AirportEntity> airportEntities = new ArrayList<>();
		CityEntity cityEntity1 = new CityEntity();
		cityEntity1.setCityCode("Z1");
		cityEntity1.setActiveFlag(true);
		cityEntity1.setCreatedOn(LocalDate.now());
		cityEntity1.setUpdatedOn(LocalDate.now());
		airportEntities.add(airportEntity1);
		airportEntities.add(airportEntity2);
		cityEntity1.setAirportEntities(airportEntities);

		CityDetailsEntity cityDetailsEntity1 = new CityDetailsEntity();
		cityDetailsEntity1.setCityName("Kerala");
		cityDetailsEntity1.setLangCode(LangCodes.EN);
		cityDetailsEntity1.setCreatedOn(LocalDate.now());
		cityDetailsEntity1.setUpdatedOn(LocalDate.now());
		
		CityDetailsEntity cityDetailsEntity2=new CityDetailsEntity();
		cityDetailsEntity2.setCityName("Kerala");
		cityDetailsEntity2.setLangCode(LangCodes.JA);
		cityDetailsEntity2.setCreatedOn(LocalDate.now());
		cityDetailsEntity2.setUpdatedOn(LocalDate.now());
		
		List<CityDetailsEntity> cityDetailsEntities1=new ArrayList<>();
		cityDetailsEntities1.add(cityDetailsEntity1);
		cityDetailsEntities1.add(cityDetailsEntity2);
		cityEntity1.setCityDetailsEntity(cityDetailsEntities1);
        cityRepository.save(cityEntity1);
	}
}
