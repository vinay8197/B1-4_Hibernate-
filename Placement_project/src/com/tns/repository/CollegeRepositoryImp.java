package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entities.College;
import com.tns.entities.Placement;
import com.tns.entities.Student;

public class CollegeRepositoryImp implements ICollegeRepository {
	private EntityManager entityManager;
	

	public CollegeRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);

		return college;
	}

	@Override
	public College searchCollege(long id) {
	    College college =entityManager.find(College.class,id);
		return college;
	}

	@Override
	public boolean deleteCollege(long id) {
		entityManager.remove(id);
		return false;
	}
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}


	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	 


}
