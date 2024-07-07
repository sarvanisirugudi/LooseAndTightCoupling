package com.looseCoupling;

public class UserManger {
    private UserDataProvider userDataProvider;

    public UserManger(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo()
    {
        return userDataProvider.getUserDetails();
    }

}
