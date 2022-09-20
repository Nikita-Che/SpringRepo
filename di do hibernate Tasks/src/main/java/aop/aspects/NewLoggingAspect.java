package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice; в библиотеку пытаются  вернуть книгу  ");

//        Long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice было поймано исключение " + e);
            targetMethodResult = "Неизвестное НАЗВАНИЕ книги";

        }
//        Long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice; в библиотеку вернули книгу  ");
//        System.out.println("aroundReturnBookLoggingAdvice : метод returnBook выполнил работу за " + (begin-end) +" милисекунд");
        return targetMethodResult;
    }
}
