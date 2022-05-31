package com.tns.service;

import com.tns.entities.Placement;

public interface IPlacementService {
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(long id);
	boolean cancelPlacement(long id);

}
