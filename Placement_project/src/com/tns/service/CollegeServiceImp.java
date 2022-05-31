package com.tns.service;

import java.util.Timer;
import java.util.TimerTask;

import com.tns.entities.College;
import com.tns.entities.Placement;
import com.tns.entities.Student;
import com.tns.repository.CollegeRepositoryImp;
import com.tns.repository.ICollegeRepository;

public class CollegeServiceImp implements ICollegeService{
	private ICollegeRepository coao;
	

	public CollegeServiceImp() {
		coao=new CollegeRepositoryImp();
	}

	@Override
	public College addCollege(College college) {
		coao.beginTransaction();
		coao.addCollege(college);
		coao.commitTransaction();
		return college;
		
	}

	@Override
	public College updateCollege(College college) {
		coao.beginTransaction();
		coao.updateCollege(college);
		coao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(long id) {
		College college =coao.searchCollege(id);
		return college;
	}

	@Override
	public boolean deleteCollege(long id) {
		coao.beginTransaction();
		boolean res=coao.deleteCollege(id);
		coao.commitTransaction();
		return res;
	}

	@Override
	public boolean schedulePlacement(Placement placement) {
		return false;
		
	
		
	}

}
