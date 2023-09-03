package com.daeatdak.user.dto;

public class UserDTO {
	private int userNumber;
	private String userEmail;
	private String userName;
	private String userPassword;
	private String userPhone;
	private String userAddress;
	private String userDetailAddress;

	public UserDTO() {
		;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserDetailAddress() {
		return userDetailAddress;
	}

	public void setUserDetailAddress(String userDetailAddress) {
		this.userDetailAddress = userDetailAddress;
	}

	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userEmail=" + userEmail + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", userPhone=" + userPhone + ", userAddress=" + userAddress
				+ ", userDetailAddress=" + userDetailAddress + "]";
	}

}
