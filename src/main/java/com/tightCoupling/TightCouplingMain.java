package com.tightCoupling;

public class TightCouplingMain {
    public static void main(String[] args)
    {
        UserManger userManger= new UserManger();
        System.out.println(userManger.getUserInfo());
    }

}
