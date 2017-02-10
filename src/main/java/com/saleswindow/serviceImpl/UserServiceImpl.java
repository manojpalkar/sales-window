package com.saleswindow.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saleswindow.dao.UserDao;
import com.saleswindow.entity.UserDetailsEntity;
import com.saleswindow.service.UserService;
import com.saleswindow.vo.UserDetailsVo;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public List<UserDetailsVo> getUserDetails() {
		List<UserDetailsVo> userDetailsVoList = new ArrayList<UserDetailsVo>();

		List<UserDetailsEntity> userDetailsList = userDao.getUserDetails();

		for (UserDetailsEntity userDetailsEntity : userDetailsList) {

			UserDetailsVo userDetailsVo = new UserDetailsVo();

			userDetailsVo.setUserPk(userDetailsEntity.getUserPk());
			userDetailsVo.setFirstName(userDetailsEntity.getFirstName());
			userDetailsVo.setLastName(userDetailsEntity.getLastName());

			userDetailsVoList.add(userDetailsVo);
		}

		return userDetailsVoList;

	}

}
