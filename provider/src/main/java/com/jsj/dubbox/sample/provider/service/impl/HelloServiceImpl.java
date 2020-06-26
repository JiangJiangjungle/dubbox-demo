package com.jsj.dubbox.sample.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jsj.dubbox.sample.api.dto.HelloRequest;
import com.jsj.dubbox.sample.api.dto.HelloResponse;
import com.jsj.dubbox.sample.api.service.HelloService;

/**
 * @author jiangshenjie
 */
@org.springframework.stereotype.Service("helloService")
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public HelloResponse sayHello(HelloRequest helloRequest) {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setMessage(String.format("Hello %s!", helloRequest.getName()));
        return helloResponse;
    }
}
