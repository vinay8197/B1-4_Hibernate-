package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entities.Placement;
import com.tns.entities.Student;

public class PlacementRepositoryImp implements IPlacementRepository{
	private EntityManager entityManager;
	

	public PlacementRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement =entityManager.find(Placement.class,id);

		return placement;
	}
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public boolean cancelPlacement(long id) {
		entityManager.remove(id);

		return true;
	}


}
