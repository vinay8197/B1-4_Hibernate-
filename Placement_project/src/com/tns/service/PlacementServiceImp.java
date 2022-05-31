package com.tns.service;

import com.tns.entities.Placement;
import com.tns.entities.Student;
import com.tns.repository.IPlacementRepository;
import com.tns.repository.IStrudentRepository;
import com.tns.repository.PlacementRepositoryImp;

public class PlacementServiceImp implements IPlacementService{
	private IPlacementRepository pao;
	


	public PlacementServiceImp() {
		pao=new PlacementRepositoryImp();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		pao.beginTransaction();
		pao.addPlacement(placement);
		pao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		pao.beginTransaction();
		pao.updatePlacement(placement);
		pao.commitTransaction();
        return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement =pao.searchPlacement(id);
		return placement;
		
	}

	@Override
	public boolean cancelPlacement(long id) {
		pao.beginTransaction();
		boolean res=pao.cancelPlacement(id);
		pao.commitTransaction();
		return res;
	}

}
