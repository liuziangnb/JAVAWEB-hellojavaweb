package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//jdbc API详解 connection

public class JDBCDemo_3_Connection {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接，如果连接的是本机3306，可以省略
        String url="jdbc:mysql:///db1?useSSL=false";
        String username="root";
        String password="root";
        Connection conn=DriverManager.getConnection(url,username,password);

        //3.定义sql
        String sql1="update account set money=3000 where id=1";
        String sql2="update account set money=3000 where id=2";

        //4.获取执行sql的对象statement
        Statement stmt=conn.createStatement();



        try {
            //        开启事务
            conn.setAutoCommit(false);

            //5.执行sql
            int count1= stmt.executeUpdate(sql1);//受影响的行数

//        6.处理结果
            System.out.println(count1);

            //5.执行sql
            int count2= stmt.executeUpdate(sql2);//受影响的行数

//        6.处理结果
            System.out.println(count2);
//            提交事务
            conn.commit();

        } catch (Exception e) {
//            回滚事务,回到开启事务之前
            conn.rollback();
            e.printStackTrace();
        }



//        7.释放资源
        stmt.close();
        conn.close();
    }
}
