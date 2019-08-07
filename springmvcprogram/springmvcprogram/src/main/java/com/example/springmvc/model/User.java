package com.example.springmvc.model;

public class User {
private int id;
private String userName;
private String password;
private String userType;
private String e_mail;
private String mobileNumber;
private boolean confirmed;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getE_mail() {
	return e_mail;
}
public void setE_mail(String e_mail) {
	this.e_mail = e_mail;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public boolean isConfirmed() {
	return confirmed;
}
public void setConfirmed(boolean confirmed) {
	this.confirmed = confirmed;
}
@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType=" + userType
			+ ", e_mail=" + e_mail + ", mobileNumber=" + mobileNumber + ", confirmed=" + confirmed + "]";
}

}
