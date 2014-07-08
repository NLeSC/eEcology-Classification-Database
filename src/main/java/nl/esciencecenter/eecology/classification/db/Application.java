package nl.esciencecenter.eecology.classification.db;

import java.util.Properties;

import javax.sql.DataSource;

import nl.esciencecenter.eecology.classification.db.doa.classification.SegmentatorMapper;
import nl.esciencecenter.eecology.classification.db.model.classification.Segmentator;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;


public class Application {
    public static void main(String[] args) {
        System.out.println("test");
        new Application().run();
    }


    private void run() {
        setUp();
    }

    private void setUp() {
    	Properties driverProperties = new Properties();
    	driverProperties.setProperty("username", "stefan_verhoeven");
    	driverProperties.setProperty("password", "stefan_verhoeven");
    	DataSource dataSource = new PooledDataSource("org.postgresql.Driver", "jdbc:postgresql://db.e-ecology.sara.nl/eecology?sslfactory=org.postgresql.ssl.NonValidatingFactory&ssl=true", driverProperties);
    	TransactionFactory transactionFactory = new JdbcTransactionFactory();
    	Environment environment = new Environment("development", transactionFactory, dataSource);
    	Configuration configuration = new Configuration(environment);
    	configuration.addMappers("nl.esciencecenter.eecology.classification.db.doa.classification");
    	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
    	
    	SqlSession session = sqlSessionFactory.openSession();
    	
    	SegmentatorMapper mapper = session.getMapper(SegmentatorMapper.class);
    	Segmentator record = new Segmentator();
    	record.setName("somename");
    	mapper.insert(record);
    	
    }
}
