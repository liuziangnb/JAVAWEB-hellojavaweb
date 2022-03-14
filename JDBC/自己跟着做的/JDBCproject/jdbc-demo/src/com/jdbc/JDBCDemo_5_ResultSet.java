package com.jdbc;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//jdbc API详解 DRsult
//封装思想

public class JDBCDemo_5_ResultSet {

    @Test
    public static void testResultSet() throws Exception {


        //2.获取连接，如果连接的是本机3306，可以省略
        String url = "jdbc:mysql:///db1?useSSL=false";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

//          定义sql
        String sql="select * from account";

//获取statement 对象
        Statement stmt=conn.createStatement();

//        执行sql
      ResultSet rs=stmt.executeQuery(sql);

//      处理结果，遍历rs中的所有数据
        //光标向下移动一行，判断当前行是否有数据
        while(rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            double money=rs.getDouble(3);

            System.out.println(id);
            System.out.println(name);
            System.out.println(money);

            System.out.println("----------------");
        }
//        释放资源
        rs.close();
        stmt.close();
        conn.close();

    }
}