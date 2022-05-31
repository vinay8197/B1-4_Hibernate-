package com.tns.service;

import com.tns.entities.Admin;

public interface IAdminService {
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin login(Admin admin);
	boolean logOut();
}
