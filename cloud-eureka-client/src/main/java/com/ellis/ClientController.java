package com.ellis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ellis.luo
 * @date 16/12/23 下午2:05
 * @description
 */
@RestController
public class ClientController
{
    private final Logger logger = LoggerFactory.getLogger(ClientController.class);

    @RequestMapping(value = "/get/{str}", method = RequestMethod.GET)
    public void todo(@PathVariable String str)
    {
        logger.info("cloud-eureka-client get , str:{}", str);
    }

}
