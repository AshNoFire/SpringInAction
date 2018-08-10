package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Audience
 *
 * @author gang.wang
 * @date 2018/07/31
 */
@Aspect
public class Audience {

    @Pointcut("execution(* aop.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }
}
