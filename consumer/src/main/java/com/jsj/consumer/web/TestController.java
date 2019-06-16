package com.jsj.consumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jsj.api.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {
    @Reference(version = "1.0.0")
    private TestService testService;

    @RequestMapping("/hello")
    public String test() {
        return testService.hello();
    }
}
