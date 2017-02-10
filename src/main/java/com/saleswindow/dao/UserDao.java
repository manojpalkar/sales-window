package com.saleswindow.dao;

import java.util.List;

import com.saleswindow.entity.UserDetailsEntity;

public interface UserDao {

	/**
	 * This method is used to get the user details from db
	 * 
	 */
	List<UserDetailsEntity> getUserDetails();

}
