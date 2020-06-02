package com.b5wang.cloudlab.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppMain {

    @RequestMapping("/")
    String home() {
        return "minikube: Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppMain.class, args);
    }
}
