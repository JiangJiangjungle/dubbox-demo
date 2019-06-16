package com.jsj.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jsj.api.service.TestService;

@org.springframework.stereotype.Service("testService")
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Override
    public String hello() {
        return "hello world!";
    }
}
