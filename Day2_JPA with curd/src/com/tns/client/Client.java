package com.tns.client;
import com.tns.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		//CRUD Operation
		//create
		student.setID(105);
		student.setName("Vinay");
		service.addStudent(student);
		
		//Retreive data-find();
		student=service.findStudentById(101);
		System.out.println("ID: "+student.getID());
		System.out.println("ID: "+student.getName());
		
		
		//update
		student=service.findStudentById(100);
		student.setName("Vijay");
		service.updateStudent(student);
		
		//delete
		student=service.findStudentById(103);
		service.removeStudent(student);
		
		

	}

}