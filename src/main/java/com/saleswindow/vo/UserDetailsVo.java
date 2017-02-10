package com.saleswindow.vo;

public class UserDetailsVo {

	private Long userPk;
	private String firstName;
	private String lastName;

	public Long getUserPk() {
		return userPk;
	}

	public void setUserPk(Long userPk) {
		this.userPk = userPk;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "UserDetailsVo [userPk=" + userPk + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
