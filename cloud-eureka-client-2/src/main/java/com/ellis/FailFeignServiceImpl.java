package com.ellis;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ellis.luo
 * @date 17/1/19 下午6:31
 * @description
 */
@Component
public class FailFeignServiceImpl implements FeignService
{
    @Override
    public String todo(@RequestParam(value = "str") String str)
    {
        return "1122";
    }
}
