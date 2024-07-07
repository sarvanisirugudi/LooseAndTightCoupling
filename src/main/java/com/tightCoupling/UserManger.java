package com.tightCoupling;

public class UserManger {
    private UserDatabase userDatabase=new UserDatabase();
    public String getUserInfo()
    {
        return userDatabase.getUserDetails();
    }

}
