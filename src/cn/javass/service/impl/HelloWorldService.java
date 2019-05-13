package cn.javass.service.impl;

import cn.javass.service.IHelloWorldService;

/*定义目标接口的实现,相当于切入点*/
public class HelloWorldService implements IHelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("===========Hello World!");
    }

    @Override
    public void sayBefore(String param) {
        System.out.println("============say"+param);
    }

    @Override
    public boolean sayAfterReturning() {
        System.out.println("================after returning后置返回通知");
        return true;
    }

    @Override
    public void sayAround(String param) {
        System.out.println("=======环绕通知around param："+param);
    }
}
