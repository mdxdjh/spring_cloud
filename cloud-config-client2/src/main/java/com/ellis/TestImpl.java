package com.ellis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by luoxiaowei on 2017/7/29.
 */
@Component
@RefreshScope
public class TestImpl {
    @Value("${from}")
    private String from;

    public String from() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}
