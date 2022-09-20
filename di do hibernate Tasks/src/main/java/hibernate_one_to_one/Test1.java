package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session=null;
        try {

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class,2);
//            session.delete(employee);
//
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");


//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Igoryan", "Govnov", "IT", 1100);
//            Detail detail = new Detail("Bairamgulovo","895121314123","igoryouSHA@mail.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");





//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Sidorov", "HR", 700);
//            Detail detail = new Detail("moskve","8950795095","Oleg@oleg.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");
        } finally {
            session.close();
            factory.close();
        }


    }
}
