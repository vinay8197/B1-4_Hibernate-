package com.tns.service;

import java.util.Scanner;

import com.tns.entities.Admin;
import com.tns.entities.Admin;
import com.tns.repository.AdminRepositoryImp;
import com.tns.repository.AdminRepositoryImp;

public class AdminServiceImp implements IAdminService {
	private AdminRepositoryImp uao;
	
Scanner s=new Scanner(System.in);
	

	public AdminServiceImp() {
		uao=new AdminRepositoryImp();
	}

	@Override
	public Admin addNewAdmin(Admin admin) {
		uao.beginTransaction();
		uao.addNewAdmin(admin);
		uao.commitTransaction();
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		uao.beginTransaction();
		uao.updateAdmin(admin);
		uao.commitTransaction();
		return admin;
	}

	@Override
	public Admin login(Admin admin) {
		System.out.println("Enetr the admin name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		if(uname==admin.getName() && upsw==admin.getPassword()) {
			return admin;
			
		}
		else {
			System.out.println("Invalid admin name or password :");
			return null;
		}
		
	
		
		
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		System.exit(0);
		return true;
	}

}
