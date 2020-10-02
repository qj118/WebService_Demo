package org.demon;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.demon.service.impl.HelloServiceImpl;

public class Server {
    public static void main(String[] args) {
        // 发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        // 设置服务地址
        factory.setAddress("http://localhost:8087/ws/hello");

        // 设置服务类
        factory.setServiceBean(new HelloServiceImpl());

        // 添加日志输入、输出拦截器，观察 soap 请求、 soap 响应内容
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        // 发布服务
        factory.create();

        System.out.println("发布服务成功，端口 8087 ...");
    }
}
