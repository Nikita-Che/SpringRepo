package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student std1 = new Student("Pes Barbosov", 2, 3.4);
        Student std2 = new Student("Kos  Huesov", 1, 5.9);
        Student std3 = new Student("Lena Soplyapokoleno", 5, 7.4);

        students.add(std1);
        students.add(std2);
        students.add(std3);
    }

    @Override
    public String toString() {
        return "University{" +
                "students=" + students +
                '}';
    }

    public List<Student> getStudents () {
        System.out.println("начало работы метода getStudents");

//        System.out.println(students.get(3));
        System.out.println("Infornamation from method getStudents: ");
        for (Student student : students) {
            System.out.print (student.getNameSurname()+ " " + student.getAvgGrade() + "\t");
        }
        System.out.println();
        return students;
    }
}
