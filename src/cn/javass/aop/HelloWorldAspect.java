package cn.javass.aop;

import org.aspectj.lang.ProceedingJoinPoint;

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

//    后置返回通知
    public void afterReturningAdvice(Object retVal){
        System.out.println("==============后置返回通知after returning advice retVal:"+retVal);
    }

//    环绕通知
//    环绕通知的第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型
    public Object aroundAdvice(ProceedingJoinPoint pip)throws Throwable{
        System.out.println("==========around before advice环绕通知");
        //在通知实现方法内部使用ProceedingJoinPoint的proceed()使目标方法执行，proceed方法可以传入可选的object【】，该数组的值将被作为目标方法执行时的参数
//        该方法用于执行目标方法，且目标方法参数被new Object[]{"replace"}替换，最后返回“retVal”返回值,虽然测试方法出入的是“hahaha”,但最终输出的是repalce
        Object retVal=pip.proceed(new Object[]{"replace"});
        System.out.println("==============around after advice环绕通知");
        return retVal;
    }
}
