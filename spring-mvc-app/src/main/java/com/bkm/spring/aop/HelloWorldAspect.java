package com.bkm.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by yongli.chen on 2017/7/11.
 */


@Aspect
@Component
public class HelloWorldAspect {

	@Pointcut(value = "execution(* com.bkm.spring.service.impl.HelloWorldServiceImpl.*(..))&& args(param)",
		argNames = "param")
	private void beforePointcut(String param) {
	}//定义一个切入点

	@Before(value = "beforePointcut(param)", argNames = "param")
	public void beforeAdvice(String param) {
		System.out.println("前置通知:" + param);
	}

/*	@AfterReturning("anyMethod()")
	public void doAfter() {
		System.out.println("后置通知");
	}

	@After("anyMethod()")
	public void after() {
		System.out.println("最终通知");
	}

	@AfterThrowing("anyMethod()")
	public void doAfterThrow() {
		System.out.println("例外通知");
	}

	@Around("anyMethod()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("进入环绕通知");
		Object object = pjp.proceed();//执行该方法
		System.out.println("退出方法");
		return object;
	}*/

}
