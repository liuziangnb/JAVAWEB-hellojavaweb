package com;

import com.Mapper.UserMapper;
import com.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo2 {
    //    Mybatis 代理开发
    public static void main(String[] args) throws IOException {

//    1.加载核心mybatis配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//    2.获取SqlSeession对象，执行SQL语句
        SqlSession sqlSession=sqlSessionFactory.openSession();

//    3.执行sql
//        List<Object> users=sqlSession.selectList("test.selectAll");
//      3.1获取UserMapper接口的代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> users=userMapper.selectAll();

        System.out.println(users);
//    4.释放资源
        sqlSession.close();

    }
}
