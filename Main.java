package demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class Main 
{
	 public static void main(String[] args) {
	        Configuration configuration = new Configuration();
	        configuration.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
	        configuration.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:xe");
	        configuration.setProperty("hibernate.connection.username", "SYSTEM");
	        configuration.setProperty("hibernate.connection.password", "SYS");
	        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
	        configuration.setProperty("hibernate.hbm2ddl.auto", "update");
	        configuration.setProperty("hibernate.show_sql", "true");
	        
	        configuration.addAnnotatedClass(model.Student.class);
	        configuration.addAnnotatedClass(model.Subject.class);

	        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                .applySettings(configuration.getProperties()).build();

	        try (SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry)) {
	            System.out.println("Hibernate Configuration Loaded Successfully");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
