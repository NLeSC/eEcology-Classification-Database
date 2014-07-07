package nl.esciencecenter.eecology.classification.database;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import nl.esciencecenter.eecology.classification.database.model.classification.Classifier;
import nl.esciencecenter.eecology.classification.database.model.classification.ClassifierType;
import nl.esciencecenter.eecology.classification.database.model.classification.Label;
import nl.esciencecenter.eecology.classification.database.model.classification.LabelSchema;
import nl.esciencecenter.eecology.classification.database.model.classification.Segmentator;

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
        properties.put("eclipselink.logging.level", "fine");
        properties.put("javax.persistence.jdbc.driver", args[0]);
        properties.put("javax.persistence.jdbc.url", args[1]);
        properties.put("javax.persistence.jdbc.user", args[2]);
        properties.put("javax.persistence.jdbc.password", args[3]);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default", properties);

        EntityManager em = emf.createEntityManager();
        //        Device device = em.find(Device.class, 355);
        //        Query query = em.createQuery("SELECT d FROM Device d");
        //        List<Device> devices = query.getResultList();
        //
        //        Query query2 = em.createQuery("SELECT ad FROM AccessDevice ad WHERE ad.id.username=:user");
        //        query2.setParameter("user", "stefan_verhoeven");
        //        List<AccessDevice> adevices = query2.getResultList();
        //
        //        Query query3 = em.createQuery("SELECT d FROM Device d JOIN d.uvaAccessDevices ad WHERE ad.id.username=:user");
        //        // SELECT d.* FROM AccessDevice ad join device d using (device) WHERE username=:user
        //        query3.setParameter("user", "stefan_verhoeven");
        //        List<Device> devices2 = query3.getResultList();
        //        System.out.println(devices2.size());
        //
        //        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        //        CriteriaQuery<Device> query4 = criteriaBuilder.createQuery(Device.class);
        //        Root<Device> root = query4.from(Device.class);
        //        Predicate condition = criteriaBuilder.equal(root.get("deviceInfoSerial"), 355);
        //        query4.where(condition);
        //        TypedQuery<Device> query5 = em.createQuery(query4);
        //        List<Device> resultList = query5.getResultList();
        //
        //        insertSegmentator(em);
        //        insertManualClassifier(em);
        insertLabelSchema(em);
    }

    private static void insertManualClassifier(EntityManager em) {
        Segmentator segmentator = getSegmentatorByName("somename", em);
        Classifier classifier = new Classifier();
        classifier.setSegmentator(segmentator);
        LabelSchema labelSchema = insertLabelSchema(em);
        classifier.setLabelSchema(labelSchema);
        ClassifierType type = new ClassifierType("manual");
        classifier.setClassifierType(type);
        classifier.setName("manual movement");
        classifier.setCreatedBy("Chris");
        classifier.setCreatedOn(new Timestamp(5000000));

        em.getTransaction().begin();
        em.persist(classifier);
        em.getTransaction().commit();
    }

    private static LabelSchema insertLabelSchema(EntityManager em) {
        LabelSchema labelSchema = new LabelSchema();
        labelSchema.setName("movement");
        Set<Label> labels = new HashSet<Label>();
        labels.add(new Label("flying", 1, "the flying movement", 0, 127, 255, labelSchema));
        labels.add(new Label("sitting", 1, "sitting still", 255, 127, 255, labelSchema));
        labelSchema.setLabels(labels);
        labelSchema.setCreatedBy("Chris");
        labelSchema.setCreatedOn(new Timestamp(5000000));

        em.getTransaction().begin();
        em.persist(labelSchema);
        em.getTransaction().commit();

        return labelSchema;
    }

    private static Segmentator getSegmentatorByName(String name, EntityManager em) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Segmentator> query4 = criteriaBuilder.createQuery(Segmentator.class);
        Root<Segmentator> root = query4.from(Segmentator.class);
        Predicate condition = criteriaBuilder.equal(root.get("name"), name);
        query4.where(condition);
        TypedQuery<Segmentator> query5 = em.createQuery(query4);
        return query5.getSingleResult();
    }

    private static void insertSegmentator(EntityManager em) {
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
