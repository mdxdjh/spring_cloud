package com.ellis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author ellis.luo
 * @date 16/12/23 下午2:24
 * @description
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class CloudEurekaClient2
{

    public static void main(String[] args)
    {
        new SpringApplicationBuilder(CloudEurekaClient2.class).web(true).run(args);
    }

}
