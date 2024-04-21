package org.example.project31;

import org.example.project31.Entity.Child;
import org.example.project31.Entity.Section;
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
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Artem", 10);
//            Child child2 = new Child("Stepan", 12);
//            Child child3 = new Child("Pavel", 9);
//            Child child4 = new Child("Josh", 6);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//            section1.addChildToSection(child4);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            /////////////////////////////

//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Song");
//            Section section2 = new Section("Volleyball");
//            Section section3 = new Section("Chess");
//            Child child1 = new Child("Masha", 13);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.persist(child1);
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            ////////////////////////////////

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            ///////////////////////////

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 5);
//
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            ///////////////////////////////////

//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Artem", 10);
//            Child child2 = new Child("Stepan", 12);
//            Child child3 = new Child("Pavel", 9);
//            Child child4 = new Child("Josh", 6);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//            section1.addChildToSection(child4);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            //////////////////////////////////

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 6);
//            session.remove(section);
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            ///////////////////////////////

            session = factory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 13);
            session.remove(child);

            session.getTransaction().commit();

            System.out.println("Успешно!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
