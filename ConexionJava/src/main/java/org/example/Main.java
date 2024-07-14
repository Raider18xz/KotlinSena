package org.example;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/escuela";
        String username = "root";
        String Pass = "haider";
    try {
        Connection conn = DriverManager.getConnection(url,username,Pass);
        System.out.println("Conexion exitosa");
    }catch (SQLException e){
    e.printStackTrace();
        System.out.println("Fallo en Conexión");
    }



    }
}