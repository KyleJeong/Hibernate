package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.Person;

public class NumDao {
	public static int register(Person u){  
		 int i=0;  
		 Session session=new Configuration().  
		  configure().buildSessionFactory().openSession();  
		          
		  Transaction t=session.beginTransaction();  
		  t.begin();  
		                  
		  i=(Integer)session.save(u);  
		                  
		  t.commit();  
		  session.close();  
		    
		  return i;  
		 }  
}
