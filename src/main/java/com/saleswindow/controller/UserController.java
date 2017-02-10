package com.saleswindow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saleswindow.service.UserService;
import com.saleswindow.vo.UserDetailsResponse;
import com.saleswindow.vo.UserDetailsVo;

@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/status")
	public ResponseEntity<String> getStatus() {
		return new ResponseEntity<String>("I am alive", HttpStatus.OK);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<UserDetailsResponse> getUserDetails() {

		List<UserDetailsVo> userDetailsVoList = userService.getUserDetails();

		UserDetailsResponse userDetailsResponse = new UserDetailsResponse();
		userDetailsResponse.setUserDetailsVoList(userDetailsVoList);

		return new ResponseEntity<UserDetailsResponse>(userDetailsResponse, HttpStatus.OK);
	}

}
