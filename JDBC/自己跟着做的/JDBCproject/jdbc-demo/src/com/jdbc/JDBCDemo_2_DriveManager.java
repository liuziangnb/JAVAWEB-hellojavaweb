package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//jdbc API详解 DRIVEMANAGER

public class JDBCDemo_2_DriveManager {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接，如果连接的是本机3306，可以省略
        String url="jdbc:mysql:///db1?useSSL=false";
        String username="root";
        String password="root";
        Connection conn=DriverManager.getConnection(url,username,password);

        //3.定义sql
        String sql="update account set money=2000 where id=1";

        //4.获取执行sql的对象statement
        Statement stmt=conn.createStatement();

        //5.执行sql
       int count= stmt.executeUpdate(sql);//受影响的行数

//        6.处理结果
        System.out.println(count);
//        7.释放资源
        stmt.close();
        conn.close();
    }
}
