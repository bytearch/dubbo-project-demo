package com.bytearch.demo.consumer.controller;

import com.bytearch.dubbo.demo.api.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bytearch
 * @email bytearch@126.com
 * @Date 2021/11/30 16:28
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @DubboReference
    IHelloService helloService;

    @GetMapping("/say")
    public String say(String name) {
        return helloService.sayHello(name);
    }
}
