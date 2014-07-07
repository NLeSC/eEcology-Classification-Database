package nl.esciencecenter.eecology.classification.db;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Application {
    public static void main(String[] args) {
        System.out.println("test");
        new Application().run();
    }

    private SessionFactory sessionFactory;

    private void run() {
        setUp();
    }

    private void setUp() {
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.getCurrentSession();
        Segmentor segmentor = new Segmentor();
        segmentor.setDescription("test description");
        segmentor.setName("new name");
        session.saveOrUpdate(segmentor);
        Serializable id = 1;
        Segmentor segmentor2 = (Segmentor) session.get(segmentor.getClass(), id);
    }
}
