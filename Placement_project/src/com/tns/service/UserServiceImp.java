package com.tns.service;

import java.util.Scanner;

import com.tns.entities.User;
import com.tns.repository.IUserRepository;
import com.tns.repository.UserRepositoryImp;

public class UserServiceImp implements IUserService{
	private UserRepositoryImp uao;
	Scanner s=new Scanner(System.in);
	

	public UserServiceImp() {
		uao=new UserRepositoryImp();
	}

	@Override
	public User addNewUser(User user) {
		uao.beginTransaction();
		uao.addNewUser(user);
		uao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		uao.beginTransaction();
		uao.updateUser(user);
		uao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		System.out.println("Enetr the user name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		if(uname==user.getName() && upsw==user.getPassword()) {
			return user;
			
		}
		else {
			System.out.println("Invalid user name or password :");
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
