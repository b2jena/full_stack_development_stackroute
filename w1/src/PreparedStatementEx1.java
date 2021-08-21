
//sal>create table Info1(name varchar(20),no integer,sal float(8,2));

//package com.java.jdbc.mysql;
import java.sql.*;
public class PreparedStatementEx1
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("MySQL Connect Example.");
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "mydb10";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";
        Class.forName(driver);
        conn = DriverManager.getConnection(url+dbName,userName,password);

        String query="insert into Info1 values(?,?,?)";

        //Step1 :  Get PreparedStatement
        PreparedStatement pstmt=conn.prepareStatement(query);

        //Step2 :  Set parameters
        pstmt.setString(1,"Kiran");
        pstmt.setInt(2,100);
        pstmt.setDouble(3,9999);
        //Step3 : execute the query
        int i=pstmt.executeUpdate();
        System.out.println("Record inserted count :"+i);
        //Execute query once again
        pstmt.setString(1,"Venu");
        pstmt.setInt(2,200);
        pstmt.setDouble(3,8888);
        i=pstmt.executeUpdate();
        System.out.println("Query executed for the second time count : "+i);
    }
}