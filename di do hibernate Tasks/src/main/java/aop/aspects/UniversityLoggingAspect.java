package aop.aspects;


import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {




//    @After("execution(* getStudents()) ")
//    public void aftegGetStudentsLoggingAdvice () {
//        System.out.println("aftegGetStudentsLoggingAdvice логируем нормально окончание работы метода или выброс исключения. ");
//    }

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение" +
//                " списка студентов перед методом getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exeption")
//    public void afterThrowingStudentsLoggingAdvice (Throwable exeption) {
//
//        System.out.println("afterThrowingStudentsLoggingAdvice логируем выброс исключения " + exeption);
//
//    }



//    @AfterReturning(pointcut = "execution(* getStudents())"
//            , returning = "students")
//    public void afterReturningStudentsLoggingAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "MR-> PIDORASOV " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade=avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningStudentsLoggingAdvice: логируем получение" +
//                " списка студентов после работы метода getStudents");
//    }
}
