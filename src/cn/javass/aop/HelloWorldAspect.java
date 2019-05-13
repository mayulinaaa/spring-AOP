package cn.javass.aop;

/*定义切面支持类，切面支持类提供了通知实现，这里只是定义了通知实现的类，并不是真正的切面实现
* 在此可以把它看作是缺少了切入点的切面*/
public class HelloWorldAspect {
//    前置通知
    public void beforeAdvice(){
        System.out.println("==========before advice");
    }
//    后置最终通知
    public void afterFinallyAdvice(){
        System.out.println("===========after finally advice");
    }
//    带参数的前置通知
    public void beforeAdvice111(String param){
        System.out.println("============before advice param:"+param);
    }
}
