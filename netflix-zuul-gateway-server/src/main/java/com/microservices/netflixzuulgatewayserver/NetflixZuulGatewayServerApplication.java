package com.microservices.netflixzuulgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class NetflixZuulGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixZuulGatewayServerApplication.class, args);
    }


    @Bean
    public ZuulLoggingController zuulLoggingController() {
        return new ZuulLoggingController();
    }
}
