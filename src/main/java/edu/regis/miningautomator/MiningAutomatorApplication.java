package edu.regis.miningautomator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan 
@EnableAutoConfiguration
@ComponentScan
public class MiningAutomatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiningAutomatorApplication.class, args);
	}
}
