package net.serkankaya.garage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.serkankaya.garage.*")
public class GarageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageApplication.class, args);
	}

}
