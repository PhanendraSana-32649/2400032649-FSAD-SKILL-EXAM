package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo 
{
	public static void main(String[] args) 
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		//Insert Operations 
		Library library = new Library();
		library.setName("KL Library");
		library.setDescription("A world class library with all facilities and number of books availability and its infrastructure is well planned");
		library.setDate("01/01/2014");
		library.setStatus("True");
		
		session.save(library);
		
		//delete operation
		session.delete(library);
		
		t.commit();
		session.close();
		sf.close();
	}
}
