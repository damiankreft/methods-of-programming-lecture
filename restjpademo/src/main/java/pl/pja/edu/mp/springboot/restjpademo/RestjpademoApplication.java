package pl.pja.edu.mp.springboot.restjpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.pja.edu.mp.springboot.restjpademo.domain.Person;
import pl.pja.edu.mp.springboot.restjpademo.service.PersonManager;

@SpringBootApplication
public class RestjpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestjpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner appSetup(@Autowired PersonManager personManager) {
		return args -> {
			System.out.println("Starting CommandLineRunner...");
			personManager.addPerson(new Person("Tinky", 1996));
			personManager.addPerson(new Person("Winky", 1997));
			personManager.addPerson(new Person("Lala", 1998));
			personManager.addPerson(new Person("Po", 1999));
		};
	}
}
