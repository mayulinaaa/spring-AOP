package cn.javass.TryClass;

import cn.javass.service.IHelloWorldService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    public void testHelloWorld(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        IHelloWorldService helloWorldService=context.getBean("helloWorldService",IHelloWorldService.class);
        helloWorldService.sayHello();
        System.out.println("带参数的前置通知");
        helloWorldService.sayBefore("before");
    }
}
