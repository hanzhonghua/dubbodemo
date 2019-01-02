package com.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @description: 启动生产者
 * @author: HanZhonghua
 * @create: 2019-01-01 17:52
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo/dubbo_demo_provider.xml");
        context.start();
        //DemoServiceImpl serviceImpl = (DemoServiceImpl) context.getBean("demoServiceImpl");
        //serviceImpl.sayHello("jim");
        // 按任意键退出
        System.in.read();
    }
}
