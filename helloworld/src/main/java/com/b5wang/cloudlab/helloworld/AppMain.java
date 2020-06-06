package com.b5wang.cloudlab.helloworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppMain {

    private static final Logger LOGGER = LogManager.getLogger(AppMain.class);

    @RequestMapping("/")
    String home() {
        LOGGER.trace("helloworld is called?!");
        LOGGER.debug("helloworld is called?!");
        LOGGER.info("helloworld is called?!");
        LOGGER.error("helloworld is called?!");
        LOGGER.fatal("helloworld is called?!");
        return "minikube: Hello World!";
    }

    public static void main(String[] args) throws Exception {
        LOGGER.info("helloworld app is starting......");// Log will not be printed out before spring app start.
        SpringApplication.run(AppMain.class, args);
        LOGGER.trace("helloworld app has started?!");
        LOGGER.debug("helloworld app has started?!");
        LOGGER.info("helloworld app has started?!");
        LOGGER.error("helloworld app has started?!");
        LOGGER.fatal("helloworld app has started?!");
    }
}
