package com.tns.repository;

import com.tns.entities.Student;

public interface IStrudentRepository {
	Student addStudent(Student student);
	Student updateStudent(Student student);
	Student searchStudentById(long id);
	Student searchStudentByHallTicket(long ticketNo);
	boolean deleteStudent(long id);
	void beginTransaction() ;
	void commitTransaction();

	
	

}
