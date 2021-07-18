package com.b5wang.cloudlab.scex.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderStart {
    public static void main(String[] args){
        SpringApplication.run(OrderStart.class,args);
    }
}
