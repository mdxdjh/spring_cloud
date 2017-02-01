package com.ellis.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ellis.luo
 * @date 17/1/19 下午3:33
 * @description
 */
@Configuration
public class RibbonConfig
{
    @Bean
    public IRule ribbonRule()
    {
        return new RoundRobinRule();
    }
}
