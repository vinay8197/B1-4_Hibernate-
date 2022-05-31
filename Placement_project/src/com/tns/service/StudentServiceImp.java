package com.tns.service;

import com.tns.entities.Certificate;
import com.tns.entities.Student;
import com.tns.repository.CertificateRepositoryImp;
import com.tns.repository.ICertificateRepository;
import com.tns.repository.IStrudentRepository;
import com.tns.repository.StudentRepositoryImp;

public class StudentServiceImp implements IStudentService{
	private static final Student Student = null;
	private IStrudentRepository dao;
	private ICertificateRepository cao;
	
	

	public StudentServiceImp() {
		dao=new StudentRepositoryImp();
		cao=new CertificateRepositoryImp();
		
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student searchStudentById(long id) {
		Student student =dao.searchStudentById(id);
		return student;
		
	}

	@Override
	public Student searchStudentByHallTicket(long ticketNo) {
		Student student =dao.searchStudentByHallTicket(ticketNo);
		return student;
		
		
	}

	@Override
	public boolean addCertificate(Certificate certificate) {
		dao.beginTransaction();
		cao.addCertificate(certificate);
		dao.commitTransaction();
		return true;
	}

	@Override
	public boolean updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		cao.updateCertificate(certificate);
		dao.commitTransaction();
		return true;
	}

	@Override
	public boolean deleteStudent(long id) {
		dao.beginTransaction();
		boolean res=dao.deleteStudent(id);
		dao.commitTransaction();
		
		return res;
	}

}
