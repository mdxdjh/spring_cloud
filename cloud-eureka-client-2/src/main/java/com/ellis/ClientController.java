package com.ellis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ellis.luo
 * @date 16/12/23 下午2:05
 * @description
 */
@RestController
public class ClientController
{
    private final Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/discoveryClient/{str}", method = RequestMethod.GET)
    public void discoveryClient(@PathVariable String str)
    {
        logger.info("discoveryClient");
        List<String> serviceIds = discoveryClient.getServices();
        for (String s : serviceIds)
        {
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(s);
            for (ServiceInstance si : serviceInstances)
            {
                logger.info("host:{}, port:{}, uri:{}, serviceId:{}", si.getHost(), si.getPort(), si.getUri(),
                        si.getServiceId());
            }
        }
    }

    @RequestMapping(value = "/restTemplate/{str}", method = RequestMethod.GET)
    public String restTemplate(@PathVariable String str)
    {
        return this.restTemplate.getForObject("http://cloud-eureka-client/get/{id}", String.class, str);
    }

    @RequestMapping(value = "/get/{str}", method = RequestMethod.GET)
    public String feignService(@PathVariable String str)
    {
        return feignService.todo(str);
    }

}
