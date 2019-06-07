package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Client
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");// Interface
		EntityManager em = factory.createEntityManager();// class
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Greet greet = new Greet();
		greet.setMessage("Welcome to JPA!");
		
		em.persist(greet);
		
		System.out.println("Added greeting to database.");

		transaction.commit();
		em.close();
		factory.close();


	}

}
