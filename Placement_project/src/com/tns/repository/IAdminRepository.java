package com.tns.repository;

import com.tns.entities.Admin;

public interface IAdminRepository {
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin deleteAdmin(long id);
	void beginTransaction() ;
	void commitTransaction();

}
