package com.tns.repository;

import javax.persistence.EntityManager;



import com.tns.entities.Student;

public class StudentRepositoryImp implements IStrudentRepository {
	private static final Student Student = null;
	private EntityManager entityManager;
	

	public StudentRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);
		
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		entityManager.merge(student);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(long ticketNo) {
		Student student =entityManager.find(Student.class,ticketNo);
		return student;
	}

	@Override
	public boolean deleteStudent(long id) {
		entityManager.remove(id);
		return false;
	}

	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public Student searchStudentById(long id) {
		Student student =entityManager.find(Student.class,id);
		return student;
	}
	




}
