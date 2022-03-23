package com;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo {
//    快速入门代码
public static void main(String[] args) throws IOException {

//    1.加载核心mybatis配置文件，获取sqlSessionFactory对象
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//    2.获取SqlSeession对象，执行SQL语句
    SqlSession sqlSession=sqlSessionFactory.openSession();

//    3.执行sql
    List<Object> users=sqlSession.selectList("test.selectAll");

    System.out.println(users);
//    4.释放资源
    sqlSession.close();

}
}
