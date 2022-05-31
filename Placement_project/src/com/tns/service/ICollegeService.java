package com.tns.service;

import com.tns.entities.College;
import com.tns.entities.Placement;

public interface ICollegeService {
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(long id);
	boolean deleteCollege(long id);
	boolean schedulePlacement(Placement placement);



}
