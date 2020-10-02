package org.demon.service;

import javax.jws.WebService;

@WebService
public interface HelloService {

    String sayHello(String name);
}
