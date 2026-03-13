package com.klef.fsad.exam;

public class ClientDemo 
{
	public static void main(String[] args) 
	{
		sessionFactory sf = new sessionFactory();
		Session session = new session();
		Transaction t = new transaction();
		
		//Insert Operations 
		Library library = new Library();
		library.setName("KL Library");
		library.setDescription("A world class library with all facilities and number of books availability and its infrastructure is well planned");
		library.setDate("01/01/2014");
		library.setStatus("True");
		
		//delete operation
		session.delete(library);
		
	}

}
