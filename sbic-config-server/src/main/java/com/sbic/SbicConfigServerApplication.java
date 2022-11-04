package com.sbic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SbicConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbicConfigServerApplication.class, args);
	}

}
