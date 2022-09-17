package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2  {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();

        try {
            List<Student> students = university.getStudents();
            for (Student student : students) {
                System.out.print (student.getNameSurname()+ " " + student.getAvgGrade() + " // "+ "\t");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Было поймано исключение " +e);
        }


        context.close();

    }
}
