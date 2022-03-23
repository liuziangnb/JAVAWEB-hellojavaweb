package com.jdbc;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//jdbc API详解 STATEMENT

public class JDBCDemo_4_Statement {
//z
//执行DML语句
//    @throws Exception

    @Test
    public void testDML() throws Exception{
        //1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接
        String url="jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username="root";
        String password="root";
        Connection conn=DriverManager.getConnection(url,username,password);

        //3.定义sql
        String sql="update account set money=5000 where id=2";

        //4.获取执行sql的对象statement
        Statement stmt=conn.createStatement();

        //5.执行sql
        int count= stmt.executeUpdate(sql);//执行完DML语句后,受影响的行数

//        6.处理结果
//        System.out.println(count);
        if(count>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
//        7.释放资源
        stmt.close();
        conn.close();

 }
//////////////////////////////////////////////////////////////////////////////////////////

//
//执行DDL语句
//    @throws Exception

    @Test
    public void testDDL() throws Exception{
        //1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接
        String url="jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username="root";
        String password="root";
        Connection conn=DriverManager.getConnection(url,username,password);

        //3.定义sql
        String sql="drop database db2";

        //4.获取执行sql的对象statement
        Statement stmt=conn.createStatement();

        //5.执行sql
        int count= stmt.executeUpdate(sql);//执行完DDL语句后,可能是0，只要不报异常就成功了

//        6.处理结果
//        System.out.println(count);
//        if(count>0){
//            System.out.println("修改成功");
//        }else{
//            System.out.println("修改失败");
//        }
//        7.释放资源
        stmt.close();
        conn.close();

    }

}
