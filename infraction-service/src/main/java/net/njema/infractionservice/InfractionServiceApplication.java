package net.njema.infractionservice;

import net.njema.infractionservice.entities.Infraction;
import net.njema.infractionservice.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class InfractionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfractionServiceApplication.class, args);
	}
	/*@Bean
	CommandLineRunner start(InfractionRepository infractionRepository){
		return args -> {
			infractionRepository.save( Infraction.builder()
							.date(new Date())
							.montantFraction(150)
							.numRadar(150).build());
			infractionRepository.save( Infraction.builder()
					.date(new Date())
					.montantFraction(100)
					.numRadar(300).build());

		};
	}*/

}
