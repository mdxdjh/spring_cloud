package com.ellis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ellis.luo
 * @date 16/12/26 上午12:21
 * @description
 */
@RestController
public class TestController2
{

    @Autowired
    private TestImpl impl;

    @RequestMapping("/from1")
    public String from()
    {
        return impl.from();
    }

}
