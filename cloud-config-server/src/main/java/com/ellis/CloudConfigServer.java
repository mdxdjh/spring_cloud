package com.ellis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
public class CloudConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServer.class, args);
    }
}
