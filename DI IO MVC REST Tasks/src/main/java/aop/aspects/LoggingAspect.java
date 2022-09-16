package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUnilibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUnilibrary()&& !returnMagazineFromLibrary()")
//    private void allMethodsExeptReturnMagazineFromLibrary() {
//    }
//
//    @Before("allMethodsExeptReturnMagazineFromLibrary()")
//    public void beforeAllMethodExeptReturnMagazineAdvice (){
//        System.out.println("beforeAllMethodExeptReturnMagazineAdvice: Log #10");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUnilibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*()))")
//    private void allReturnMethodsFromUnilibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUnilibrary()||allReturnMethodsFromUnilibrary()")
//    private void allGetAndReturnMethodsFromUnilibrary() {
//    }


//    @Before("allGetAndReturnMethodsFromUnilibrary()")
//    public void allGetAndReturnMethodsLogginfAdvice(){
//        System.out.println("allGetAndReturnMethodsLogginfAdvice: writing log#3 ");
//    }
//
//    @Before("allGetMethodsFromUnilibrary()")
//    public void beforeGetLogginAdvice() {
//        System.out.println("beforeGetLogginAdvice: writing log#1 ");
//    }
//
//    @Before("allReturnMethodsFromUnilibrary()")
//    public void beforeReturnLogginAdvice() {
//        System.out.println("beforeReturnLogginAdvice: writing log#2 ");
//    }


    @Before("aop.aspects.MyPointCuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice, логирование попытки получить книги или журнала ");
    }


}
