package org.demon.service.impl;

import org.demon.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name + ", Welcome to WebService!";
    }
}
