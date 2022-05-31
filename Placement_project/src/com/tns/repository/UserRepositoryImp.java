package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entities.User;

public class UserRepositoryImp implements IUserRepository{
	private EntityManager entityManager;
	
	

	public UserRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);

		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(long id) {
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
