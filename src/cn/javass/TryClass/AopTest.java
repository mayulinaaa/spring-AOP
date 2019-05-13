package cn.javass.TryClass;

import cn.javass.service.IHelloWorldService;
import cn.javass.service.IIntroductionService;
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
        System.out.println("后置返回通知");
        helloWorldService.sayAfterReturning();
        System.out.println("环绕通知");
        helloWorldService.sayAround("hahaha");
        System.out.println("引入的测试");
        IIntroductionService iIntroductionService=context.getBean("helloWorldService",IIntroductionService.class);
        iIntroductionService.induct();
    }
}
