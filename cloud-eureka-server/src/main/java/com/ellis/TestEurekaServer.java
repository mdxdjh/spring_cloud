package com.ellis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestEurekaServer
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder(TestEurekaServer.class).web(true).run(args);
    }
}
