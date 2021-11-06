package lt.ku.studentai.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class DB {
	private static DB db=null;
	private StandardServiceRegistry serviceRegistry=null;
	private SessionFactory sessionFactory=null;
	
	private DB() {
		this.serviceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(this.serviceRegistry).getMetadataBuilder().build();
		this.sessionFactory=metadata.getSessionFactoryBuilder().build();
	}
	
	public static Session getSession() {
		if (db==null) {
			db=new DB();
		}
		return db.sessionFactory.openSession();
	}

}
