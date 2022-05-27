package com.tns.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e=new Employee();
		e.setEmployeeName("Vinay T N");
		
		Employee e1=new Employee();
		e1.setEmployeeName("Naveen");
		
		Address a=new Address();
		a.setAddressId(10);
		a.setStreet("Shankar Nagar");
		a.setCity("Pune");
		a.setState("Maharashtra");
		
		Address a1=new Address();
		a1.setAddressId(11);
		a1.setStreet("Ganespeth");
		a1.setCity("Nagpur");
		a1.setState("Maharashtra");
		
		e.setAddress(a);
		e1.setAddress(a1);
		em.persist(e);
		em.persist(e1);
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		

	}

}