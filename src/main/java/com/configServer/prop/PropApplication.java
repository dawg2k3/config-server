package com.configServer.prop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PropApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropApplication.class, args);
	}
}
