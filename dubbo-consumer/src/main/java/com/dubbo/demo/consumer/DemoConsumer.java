package com.dubbo.demo.consumer;

import com.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: dubbo consumer demo
 * @author: HanZhonghua
 * @create: 2019-01-01 21:38
 */
public class DemoConsumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo/dubbo_demo_consumer.xml");
        context.start();

        DemoService demo = (DemoService) context.getBean("demoService");
        String jim = demo.sayHello("Jim");
        System.out.println(jim);
    }
}
