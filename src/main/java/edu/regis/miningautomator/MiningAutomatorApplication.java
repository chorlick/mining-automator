package edu.regis.miningautomator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class MiningAutomatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiningAutomatorApplication.class, args);

    }
}
