package org.ses.metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MicrometerAwsExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicrometerAwsExampleApplication.class, args);
    }
}