package com.ellis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer2
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder(CloudEurekaServer2.class).web(true).run(args);
    }
}
