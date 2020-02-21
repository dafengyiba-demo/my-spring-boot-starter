package com.company.my;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloServiceProperties.class)
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloServiceProperties properties;

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setProperties(properties);
        return helloService;
    }

}
