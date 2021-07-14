/**
 * 
 */
package com.ibs.airaidermasterdataservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.entity.AirportEntity;
import com.ibs.airaidermasterdataservice.repository.AirportDetailsRepository;
import com.ibs.airaidermasterdataservice.repository.AirportRepository;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 *
 */
@Configuration
public class LoadDatabase implements CommandLineRunner {

	@Autowired
	private AirportRepository airportRepository;

	@Autowired
	private AirportDetailsRepository airportDetailsRepository;

	/*
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		
		
		AirportEntity airportEntity2 = new AirportEntity();
		airportEntity2.setCityId(234);
		airportEntity2.setAirportCode("BBB");
		airportRepository.save(airportEntity2);

		AirportDetailsEntity airportDetailsEntity = new AirportDetailsEntity();
		airportDetailsEntity.setLangCode(LangCodes.EN);
		airportDetailsEntity.setAirportName("calicut");
		airportDetailsEntity.setAirportId(1);
//		airportDetailsRepository.save(airportDetailsEntity);
		
		AirportEntity airportEntity1 = new AirportEntity();
		airportEntity1.setAirportCode("AAA");
		airportEntity1.setCityId(123);
		airportEntity1.setAirportDetailsEntity(airportDetailsEntity);
		airportRepository.save(airportEntity1);


	}

}
