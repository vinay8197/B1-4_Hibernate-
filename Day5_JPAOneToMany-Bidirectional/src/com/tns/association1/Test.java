package com.tns.association1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create a new department
		Department dept=new Department();
		dept.setId(1);
		dept.setName("Sales");
		
		Department dept1=new Department();
		dept1.setId(2);
		dept1.setName("Finance");
		
		Employee e1=new Employee();
		e1.setName("Santhosh");
		e1.setSalary(35000);
		e1.setDept(dept1);
		
		Employee e2=new Employee();
		e2.setName("Vinay");
		e2.setSalary(75000);
		e2.setDept(dept);
		
		em.persist(e1);
		em.persist(e2);
		
		System.out.println("Added employees with department");
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

}