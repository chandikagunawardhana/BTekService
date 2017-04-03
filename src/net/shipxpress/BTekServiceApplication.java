package net.shipxpress;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.shipxpress.service.BTekDataService;


@SpringBootApplication
public class BTekServiceApplication implements CommandLineRunner {
	
	@Autowired
	BTekDataService bTekDataService;

	public static void main(String[] args) {
		System.out.println("start main method");
		SpringApplication.run(BTekServiceApplication.class, args);
		System.out.println("end main method");
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("start run method");

		System.out.println("create BTekData...");
		bTekDataService.createBTekData(new Long(1547), new Long(1234), "Y", "BUCKLER", "KEANE", new Date(), "KUNGLE A 40/70 STEUBENVILLE", "40/70",
				new BigDecimal(50500), "DJ", "STEUBENVILLE", new BigDecimal(31660), "N", new BigDecimal(18840), new BigDecimal(31660),
				new Date(), new Date(), new BigDecimal(9.42), new BigDecimal(9.2), new Long(369), "PO NUM");
		//bTekDataService.createBTekData(new Long(1548), null, null);
		//bTekDataService.createBTekData(new Long(1549), null, null);
		//bTekDataService.createBTekData(new Long(1550), null, null);

		System.out.println("look up");
		bTekDataService.lookup().forEach(bTekData -> System.out.println(bTekData));

		System.out.println("total : " + bTekDataService.total());
		
		System.out.println("end run method");
	}
}
