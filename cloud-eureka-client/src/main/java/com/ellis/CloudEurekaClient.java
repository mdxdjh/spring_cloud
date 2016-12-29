package com.ellis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ellis.luo
 * @date 16/12/23 下午2:24
 * @description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudEurekaClient
{

    public static void main(String[] args)
    {
        new SpringApplicationBuilder(CloudEurekaClient.class).web(true).run(args);
    }

}
