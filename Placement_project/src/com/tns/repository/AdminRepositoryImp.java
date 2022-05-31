package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entities.Admin;

public class AdminRepositoryImp implements IAdminRepository{
private EntityManager entityManager;
	
	

	public AdminRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Admin addNewAdmin(Admin admin) {
		entityManager.persist(admin);

		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		entityManager.merge(admin);
		return admin;
	}

	@Override
	public Admin deleteAdmin(long id) {
		entityManager.remove(id);
        return null;
	}
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}


}
