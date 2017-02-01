package com.ellis;

import com.ellis.config.RibbonConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author ellis.luo
 * @date 16/12/23 下午2:24
 * @description
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "cloud-eureka-client-2", configuration = RibbonConfig.class)
public class CloudEurekaClient2
{

    public static void main(String[] args)
    {
        new SpringApplicationBuilder(CloudEurekaClient2.class).web(true).run(args);
    }

}
