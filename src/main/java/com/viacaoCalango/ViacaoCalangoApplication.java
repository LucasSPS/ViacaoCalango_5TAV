package com.viacaoCalango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ViacaoCalangoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViacaoCalangoApplication.class, args);
	}

}
