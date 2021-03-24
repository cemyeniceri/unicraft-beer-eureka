package com.github.cemyeniceri.unicraft.beer.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UnicraftBeerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnicraftBeerEurekaApplication.class, args);
    }

}