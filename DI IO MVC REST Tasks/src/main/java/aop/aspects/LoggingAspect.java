package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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


    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature "+ methodSignature);
        System.out.println("methodSignature.getMethod() "+ methodSignature.getMethod());
        System.out.println("methodSignature.getName() "+ methodSignature.getName());

        System.out.println("beforeGetLoggingAdvice, логирование попытки получить книги или журнала ");
        System.out.println("___________________________________");

        if(methodSignature.getName().equalsIgnoreCase("addbook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: НАзвание книги -"  + myBook.getName()
                            + "автор" +myBook.getAuthor() + "год издания " +
                            myBook.getYearOfPublic());
                } else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }

        }
    }


}
