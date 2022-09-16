package aop;

import java.util.ArrayList;
import java.util.List;

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

    public List<Student> getStudents () {
        System.out.println("Infornamation from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
