package nl.esciencecenter.eecology.classification.database;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import nl.esciencecenter.eecology.classification.database.model.Segmentator;

public class Application {

    /*-
     * argument example: 
     * 
     *   org.postgresql.Driver
     *   jdbc:postgresql://db.e-ecology.sara.nl/eecology?sslfactory=org.postgresql.ssl.NonValidatingFactory&ssl=true 
     *   username
     *   password
     * 
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("eclipselink.logging.level", "FINE");
        properties.put("javax.persistence.jdbc.driver", args[0]);
        properties.put("javax.persistence.jdbc.url", args[1]);
        properties.put("javax.persistence.jdbc.user", args[2]);
        properties.put("javax.persistence.jdbc.password", args[3]);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default", properties);

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Segmentator segmentor = new Segmentator();
            segmentor.setName("somename");
            segmentor.setConfiguration("some config");
            em.persist(segmentor);

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

}
