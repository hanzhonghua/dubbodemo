package com.provider;

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
        // 阻塞程序，按任意键退，防止链接打开完成调用后又关闭，
        System.in.read();
    }
}
