package project.carEvidence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CarEvidenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarEvidenceApplication.class, args);
	}

}
