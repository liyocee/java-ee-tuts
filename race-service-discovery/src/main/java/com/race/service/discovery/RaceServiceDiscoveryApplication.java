package com.race.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RaceServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaceServiceDiscoveryApplication.class, args);
    }
}
