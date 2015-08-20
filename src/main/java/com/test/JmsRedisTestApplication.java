package com.test;


import com.test.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration
public class JmsRedisTestApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(JmsRedisTestApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JmsRedisTestApplication.class, args);
        getSub().listenSubscriber();

    }

    @Bean
    public static SubscriberService getSub() {
        return new SubscriberService();
    }
}
