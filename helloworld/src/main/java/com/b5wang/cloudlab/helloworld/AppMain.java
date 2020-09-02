package com.b5wang.cloudlab.helloworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @SpringBootApplication: is a convenience annotation that adds all of the following:
 * <p>@Configuration: Tags the class as a source of bean definitions for the application context.<p/>
 * <p>@EnableAutoConfiguration: For example, detect spring-webmvc config on the classpath</p>
 * <p>@ComponentScan: </p>
 * */
@SpringBootApplication
public class AppMain {

    private static final Logger LOGGER = LogManager.getLogger(AppMain.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppMain.class, args);
        LOGGER.info("app started!");
    }
}
