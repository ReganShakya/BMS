package com.voodoo.bms;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author regan
 */
@SpringBootApplication
public class AppStarter {
    public static void main(String[] args) {
        String log4jConfPath = "etc/log4j2.properties";
        PropertyConfigurator.configure(log4jConfPath);
        SpringApplication.run(AppStarter.class, args);
    }
}
