package com.tns.service;
import com.tns.dao.StudentDao;
import com.tns.dao.StudentDaoImp;
import com.tns.entities.Student;

public class StudentServiceImpl implements StudentService
{
	private StudentDao dao;
	

	public StudentServiceImpl()
	{
		dao=new StudentDaoImp();
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student findStudentById(int ID) {
		Student student =dao.getStudentById(ID);
		return student;
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

}