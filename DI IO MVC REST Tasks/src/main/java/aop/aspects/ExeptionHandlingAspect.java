package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(30)
public class ExeptionHandlingAspect {
    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddExeptionHandlingAdvice() {
        System.out.println("beforeGetExeptionHandlingAdvice: ловим и обрабатываем исключение при попытке получить книгу или журнал");
        System.out.println("___________________________________");
    }
}
