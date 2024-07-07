package com.looseCoupling;


public class LooseCouplingMain {
    public static void main(String[] args)
    {
        UserDatabaseProvider databaseProvider=new UserDatabaseProvider();
        UserManger userMangerWithDB =new UserManger(databaseProvider);
        System.out.println(userMangerWithDB.getUserInfo());

        UserDataProvider ws= new WebServiceDataProvider();
        UserManger userMangerwithws= new UserManger(ws);
        System.out.println(userMangerwithws.getUserInfo());

        UserDataProvider newDb =new NewDataProvider();
        UserManger userMangerwithnew =new UserManger(newDb);
        System.out.println(userMangerwithnew.getUserInfo());
    }

}
