package com.tns.repository;

import com.tns.entities.Placement;

public interface IPlacementRepository {
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(long id);
	boolean cancelPlacement(long id);
	void beginTransaction() ;
	void commitTransaction();


}
