package com.b5wang.cloudlab.scex.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayStart {
    public static void main(String[] args) {
        SpringApplication.run(GatewayStart.class, args);
    }
}
