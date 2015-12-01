package Entities;

public class User {

	private String userName;
	private String userFullName;
	private String userPassword;
	private String userType;
	
	public User(String userName, String userFullName, String userPassword, String userType) {
		this.userName = userName;
		this.userFullName = userFullName;
		this.userPassword = userPassword;
		this.userType = userType;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
}