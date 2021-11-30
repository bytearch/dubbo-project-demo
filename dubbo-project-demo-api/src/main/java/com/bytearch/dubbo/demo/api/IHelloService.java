package com.bytearch.dubbo.demo.api;

import java.io.Serializable;

public interface IHelloService extends Serializable {
    static final long serialVersionUID = -5915512369764637210L;

    public String sayHello(String name);
}
