package com.saleswindow.vo;

import java.util.List;

public class UserDetailsResponse {

	private List<UserDetailsVo> userDetailsVoList;

	public List<UserDetailsVo> getUserDetailsVoList() {
		return userDetailsVoList;
	}

	public void setUserDetailsVoList(List<UserDetailsVo> userDetailsVoList) {
		this.userDetailsVoList = userDetailsVoList;
	}

	@Override
	public String toString() {
		return "UserDetailsResponse [userDetailsVoList=" + userDetailsVoList + "]";
	}

}
