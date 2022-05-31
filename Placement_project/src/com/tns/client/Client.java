package com.tns.client;

import java.time.LocalDate;
import java.util.Date;

import com.tns.entities.Admin;
import com.tns.entities.Certificate;
import com.tns.entities.College;
import com.tns.entities.Placement;
import com.tns.entities.Student;
import com.tns.entities.User;
import com.tns.service.AdminServiceImp;
import com.tns.service.CertificateServiceImp;
import com.tns.service.CollegeServiceImp;
import com.tns.service.IAdminService;
import com.tns.service.ICertificateService;
import com.tns.service.ICollegeService;
import com.tns.service.IPlacementService;
import com.tns.service.IStudentService;
import com.tns.service.IUserService;
import com.tns.service.PlacementServiceImp;
import com.tns.service.StudentServiceImp;
import com.tns.service.UserServiceImp;

public class Client {

	public static void main(String[] args) {
		Student student = new Student();
		IStudentService service = new StudentServiceImp();
		
	    student.setId(102);
		student.setName("ramu");
		student.setRoll(3);
		student.setQualification("BE");
		student.setCourse("Technical couse");
		student.setYear(2022);
		Certificate c=new Certificate();
		c.setId(1002);
		c.setYear(2022);
		College col=new College();
		col.setId(502);
		col.setCollegeName("Siddaganga Institute Of Technology ");
		col.setLocation("Tumkur");
		User u=new User();
		u.setId(602);
		u.setName("Vinay kumar  ");
		u.setPassword("12345658255");
		IUserService user=new UserServiceImp();
		user.addNewUser(u);
		col.setCollegeAdmin(u);
		ICollegeService college=new CollegeServiceImp();
		college.addCollege(col);
		c.setCollege(col);
		ICertificateService certificate=new CertificateServiceImp();
		certificate.addCertificate(c);
        student.setCollege(col);
		student.setRoll(202);
		student.setQualification("BE");
		student.setCourse("CSE");
	    student.setCertificate(c);
		student.setHallTicketNo(703);
		
		Admin a=new Admin();
		a.setId(302);
		a.setName("ravi kumar ");
		a.setPassword("789568586655");
	    IAdminService ad=new AdminServiceImp();
	    ad.addNewAdmin(a);
		
		
		System.out.println("date is inserted");
		Placement p=new Placement();
		p.setId(902);
		LocalDate date=LocalDate.now();
		p.setDate(date);
		p.setQualification("BE");
		p.setCollege(col);
		p.setName("placement creaters group Tumkur");
		p.setYear(2022);
		IPlacementService placement =new PlacementServiceImp();
		placement.addPlacement(p);
		service.addStudent(student);
	
	
	
		
	   System.out.println("data is inerted");
		
		
	student = service.searchStudentById(101);
		System.out.println("Id is: "+student.getId());
		System.out.println("Roll is: "+student.getRoll());
		System.out.println("college is: "+student.getCollege());
		
		student = service.searchStudentById(101);
		student.setCollege(col);
		service.updateStudent(student);
		System.out.println("Updated successfully");
	
		
		/*student= service.searchStudentById(100);
		service.deleteStudent(100);
		System.out.println("delete is sucessful");
	*/
	}

}
