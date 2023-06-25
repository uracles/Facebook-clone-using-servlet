package com.uracles.facebookclone.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {
    public static Connection connectionToDatabase(){
        Connection databaseconnection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/decagon", "root","Merakool1994@$");
        }catch(Exception e){System.out.println(e);}
        return databaseconnection;
    }

//    public static void main(String[] args) {
//        System.out.println(connectionToDatabase());
//    }
}



