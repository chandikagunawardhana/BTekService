package net.shipxpress.service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Service;

import net.shipxpress.dao.BTekDataServiceDao;
import net.shipxpress.domain.BTekData;

@Service
public class BTekDataService {

	private BTekDataServiceDao bTekDataServiceDao;

	public BTekDataService(BTekDataServiceDao bTekDataServiceDao) {
		this.bTekDataServiceDao = bTekDataServiceDao;
	}

	public BTekData createBTekData(Long number, Long accessCard, String active, String carrier, String customer, Date bTekDataDate,
			String destination, String grade, BigDecimal gross, String initials, String location, BigDecimal inWeight, String inYard,
			BigDecimal net, BigDecimal tare, Date inDateTime, Date outDateTime, BigDecimal tons, BigDecimal totalTons, Long truck, String poNumber) {
		return bTekDataServiceDao.save(new BTekData(number, accessCard, active, carrier, customer, bTekDataDate, destination, grade,
				gross, initials, location, inWeight, inYard, net, tare, inDateTime, outDateTime, tons, totalTons, truck, poNumber));
	}

	public Iterable<BTekData> lookup() {
		return bTekDataServiceDao.findAll();
	}

	public Long total() {
		return bTekDataServiceDao.count();
	}
}
