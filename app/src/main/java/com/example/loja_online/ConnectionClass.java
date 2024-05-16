package com.example.loja_online;

import android.util.Log;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class ConnectionClass {


    private static final String url = "jdbc:mysql://192.168.55.202:3306/lojaOnline";
    private static final String username = "root";
  private static final String password  = "";


  private static   Connection conn;

  public static Connection getConnection(){

try{

if(conn == null){

    conn = (Connection) DriverManager.getConnection(url, username, password);

    return conn;
}else{
return conn;

}

}catch(SQLException e){
e.printStackTrace();
return null;

}


  }

}
