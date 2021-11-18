package uk.co.sheffieldwebprogrammer.feignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FeignserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignserverApplication.class, args);
	}


}
