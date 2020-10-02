package org.demon;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.demon.service.impl.UserServiceImpl;

public class Server {

    public static void main(String[] args) {

        // 创建发布服务接口
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        // 设置服务地址
        factory.setAddress("http://localhost:8087/ws/");
        // 设置服务类
        factory.setServiceBean(new UserServiceImpl());
        // 开启日志
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        // 发布服务
        factory.create();

        System.out.println("发布服务成功，端口8087");
    }
}
