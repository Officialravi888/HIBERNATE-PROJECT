package org.example;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Test {
    private static SessionFactory sessionFactory = null;
    static {
        try {
            loadSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadSessionFactory() {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addResource("Employee.hbm.xml");
        //configuration.addAnnotatedClass(org.example.Employee.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public static Session getSession() throws HibernateException {

        Session session = null;
        try {
            session = sessionFactory.openSession();
        } catch (Exception e) {
            System.err.println("Exception while opening a session ");
            e.printStackTrace();
        }

        return session;
    }

    public static void main(String[] args) {

        Session session = null;
        Transaction txn = null;

        try {
            session = getSession();
            txn = session.beginTransaction();

            Employee user1 = new Employee("Tom", 25);
            session.save(user1);

            txn.commit();
        } catch (Exception e) {
            if (txn != null)
                txn.rollback();
            e.printStackTrace();
        } finally {
            session.close();

        }

    }

}
