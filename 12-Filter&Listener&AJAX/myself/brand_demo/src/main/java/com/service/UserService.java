package com.service;

import com.mapper.BrandMapper;
import com.mapper.UserMapper;
import com.pojo.Brand;
import com.pojo.User;
import com.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


//    登录方法

    public User login(String username, String password) {

        //2.获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //3.获取USerMapper
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        //4.调用方法
        User user=mapper.select(username,password);

//        释放资源
        sqlSession.close();

        return user;

    }



    //    注册方法

    public boolean register(User user) {

        //2.获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //3.获取USerMapper
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        //4.调用方法
        User u=mapper.selectByUsername(user.getUsername());

        if(u==null){
//            用户名不存在，注册
            mapper.add(user);
            sqlSession.commit();

        }

        sqlSession.close();
        return u==null;


    }


}
