package com.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dubbo.demo.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: dubbo demo
 * @author: HanZhonghua
 * @create: 2019-01-01 17:03
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());

        return "Hello " + name + "response from provider :" + RpcContext.getContext().getLocalAddress();
    }
}
