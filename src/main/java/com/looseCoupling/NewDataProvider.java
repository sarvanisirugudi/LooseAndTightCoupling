package com.looseCoupling;

public class NewDataProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Data from new data provider";
    }
}
