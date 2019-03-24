package com.fei.product.util;

import java.sql.*;

public class GeneratorClass {

    private final static String driverName = "com.mysql.jdbc.Driver" ;
    private final static String username =  "root" ;
    private final static String password =  "123456" ;
    private final static String url  = "jdbc:mysql://127.0.0.1:3306/cloud?characterEncoding=utf-8" ;

    static{
        try {
            Class.forName(driverName) ;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private final static String[] tableNames = {"product_category","product_info"} ;

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(url,username,password) ;
        Statement statement = connection.createStatement() ;
        for(String table:tableNames){
//            statement.execute("desc " + table) ;
            ResultSet rs = statement.executeQuery("desc "+table) ;
        }

    }

}












