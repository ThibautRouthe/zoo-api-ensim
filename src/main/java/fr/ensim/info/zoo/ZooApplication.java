package fr.ensim.info.zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ZooApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZooApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
	}

}
