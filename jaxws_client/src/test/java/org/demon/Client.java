package org.demon;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.demon.service.HelloService;

public class Client {
    public static void main(String[] args) {
        // 创建 cxf 代理工厂
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        // 设置远程访问服务端地址
        factory.setAddress("http://localhost:8087/ws/hello");

        // 设置接口类型
        factory.setServiceClass(HelloService.class);

        // 对接口生成代理对象
        HelloService helloService = factory.create(HelloService.class);

        // 远程访问服务端方法
        String content = helloService.sayHello("Demon");
        System.out.println(content);
    }
}
