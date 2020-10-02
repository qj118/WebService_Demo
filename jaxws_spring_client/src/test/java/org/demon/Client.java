package org.demon;

import org.demon.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Client {

    @Autowired
    private HelloService helloService;

    @Test
    public void remote(){
        System.out.println(helloService.getClass());
        System.out.println(helloService.sayHello("孟美岐"));
    }
}
