package com.ellis;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ellis.luo
 * @date 16/12/24 下午8:52
 * @description
 */
@FeignClient(name = "cloud-eureka-client", fallback = FailFeignServiceImpl.class)
public interface FeignService
{
    @RequestMapping(value = "/get/{str}")
    public String todo(@RequestParam(value = "str") String str);
}
