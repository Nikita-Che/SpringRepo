package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session=null;
        try {


            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class,4);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("DONE!");




//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class,1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");




//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class,1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");



//            session = factory.getCurrentSession();
//            Department dep = new Department("it",300,1200);
//            Employee employee = new Employee("Vasilii","Govnov",1100);
//            Employee employee2 = new Employee("Elena","Hueva",500);
//
//            dep.addEmployeeToDepartment(employee);
//            dep.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");


        } finally {
            session.close();
            factory.close();
        }


    }
}
