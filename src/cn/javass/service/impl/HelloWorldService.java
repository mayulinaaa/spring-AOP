package cn.javass.service.impl;

import cn.javass.service.IHelloWorldService;

/*定义目标接口的实现*/
public class HelloWorldService implements IHelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("===========Hello World!");
    }

    @Override
    public void sayBefore(String param) {
        System.out.println("============say"+param);
    }
}
