package com.ellis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ellis.luo
 * @date 16/12/23 下午2:05
 * @description
 */
@RestController
public class TestClientController
{
    private final Logger logger = LoggerFactory.getLogger(TestClientController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/todo/{thing}", method = RequestMethod.GET)
    public String todo(@PathVariable String thing)
    {
        logger.info("EurekaClient todo input:{}", thing);
        List<String> serviceIds = discoveryClient.getServices();
        for (String s : serviceIds)
        {
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(s);
            for (ServiceInstance si : serviceInstances)
            {
                logger.info("======= {}, {}, {}, {}", si.getHost(), si.getPort(), si.getUri(), si.getServiceId());
            }
        }
        return "EurekaClient todo input:" + thing;
    }

}
