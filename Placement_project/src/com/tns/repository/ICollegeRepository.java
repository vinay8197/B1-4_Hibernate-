package com.tns.repository;

import com.tns.entities.College;

public interface ICollegeRepository {
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(long id);
	boolean deleteCollege(long id);
	void beginTransaction() ;
	void commitTransaction();


}
