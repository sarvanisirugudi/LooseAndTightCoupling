package com.looseCoupling;

public class WebServiceDataProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "From web Service to provide Data";
    }
}
