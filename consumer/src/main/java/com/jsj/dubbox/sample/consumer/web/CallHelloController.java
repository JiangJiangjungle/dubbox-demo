package com.jsj.dubbox.sample.consumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jsj.dubbox.sample.api.dto.HelloRequest;
import com.jsj.dubbox.sample.api.dto.HelloResponse;
import com.jsj.dubbox.sample.api.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author jiangshenjie
 */
@RestController
@RequestMapping("")
public class CallHelloController {
    @Reference(version = "1.0.0")
    private HelloService helloService;

    @RequestMapping("/hello")
    public HelloResponse test() {
        HelloRequest helloRequest = new HelloRequest();
        helloRequest.setName(LocalDateTime.now().toString());
        return helloService.sayHello(helloRequest);
    }
}
