package com.tharun.CouldConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class CouldConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouldConfigServerApplication.class, args);
	}

}
