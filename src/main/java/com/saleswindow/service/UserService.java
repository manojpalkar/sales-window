package com.saleswindow.service;

import java.util.List;

import com.saleswindow.vo.UserDetailsVo;

public interface UserService {

	/**
	 * This method is used to get user details from database
	 */
	List<UserDetailsVo> getUserDetails();

}
