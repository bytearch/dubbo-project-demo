package com.bytearch.demo.provider.service;

import com.bytearch.dubbo.demo.api.IHelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author bytearch
 * @email bytearch@126.com
 * @Date 2021/11/30 16:34
 */
@DubboService(interfaceClass = IHelloService.class)
@Component
@Slf4j
public class HelloService implements IHelloService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
