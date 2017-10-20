package com.ellis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对springcloud config 刷新配置中心需要引入这个包，加上@RefreshScope才能感知refresh的更新
 *
 * 需要做到push代码后感知自动更新可以使用git的webhook，设置一个提交后的回调请求来执行refresh进行更新
 *
 * curl -X POST http://localhost:7001/bus/refresh -d 'destination=**'
 */
@RefreshScope
@RestController
public class TestController
{

    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from()
    {
        return this.from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getFrom()
    {
        return from;
    }

}
