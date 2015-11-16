package com.race.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RaceWebClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaceWebClientApplication.class, args);
    }
}
