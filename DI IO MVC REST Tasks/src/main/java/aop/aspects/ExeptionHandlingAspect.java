package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(30)
public class ExeptionHandlingAspect {
    @Before("aop.aspects.MyPointCuts.allGetMethods()")
    public void beforeGetExeptionHandlingAdvice() {
        System.out.println("beforeGetExeptionHandlingAdvice: ловим и обрабатываем исключение при попытке получить книгу или журнал");
    }
}
