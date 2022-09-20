package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 8);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");




            session = factory.getCurrentSession();

            session.beginTransaction();
            Child child = session.get(Child.class,4);
            session.delete(child);

            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();
            System.out.println("DONE!!!");








//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class,1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");







//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("volley");
//            Section section2 = new Section("chess");
//            Section section3 = new Section("math");
//            Child child = new Child("Igor",10);
//
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//            child.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");







//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("dance");
//            Child child = new Child("olya",10);
//            Child child1 = new Child("grisha",13);
//            Child child2 = new Child("valya",15);
//            section1.addChildToSection(child);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
