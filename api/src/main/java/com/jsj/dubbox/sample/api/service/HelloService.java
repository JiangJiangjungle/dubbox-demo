package com.jsj.dubbox.sample.api.service;

import com.jsj.dubbox.sample.api.dto.HelloRequest;
import com.jsj.dubbox.sample.api.dto.HelloResponse;

/**
 * @author jiangshenjie
 */
public interface HelloService {

    HelloResponse sayHello(HelloRequest helloRequest);
}
