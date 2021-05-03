package com.company;

import java.util.Date;

public class User extends PersonalInfo{

    String userPhoneNumber;
    String password;
    String Address;

    public User(int userId, String userFirstName, String userLastName, String userEmail, Date userDateOfBirth, String userPhoneNumber, String password, String address) {
        super(userId, userFirstName, userLastName, userEmail, userDateOfBirth);
        this.userPhoneNumber = userPhoneNumber;
        this.password = password;
        Address = address;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void logIn(String email,String password){

    }

    public void searchBook(){

    }


}
