package com.service;

import com.mapper.BrandMapper;
import com.pojo.Brand;
import com.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


        //查询所有功能
    public List<Brand> selectAll() {

        //调用对应的BrandMapper.selectALll()

        //2.获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //3.获取brandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //4.调用方法
        List<Brand> brands = mapper.selectALl();

        //5.释放资源
        sqlSession.close();

        return brands;

    }


    //    添加
//    brand
    public void add(Brand brand) {
        //2.获取SqlSession
        SqlSession sqlSession = factory.openSession();
//        3.获取brandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //4.调用方法
        mapper.add(brand);

//        提交事务
        sqlSession.commit();

//        释放资源
        sqlSession.close();

    }


    //根据id查询
    public Brand selectById(int id) {
        //2.获取SqlSession
        SqlSession sqlSession = factory.openSession();
//        3.获取brandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //4.调用方法
        Brand brand = mapper.selectById(id);

        sqlSession.close();

        return brand;

    }




    //    修改
//    brand
    public void update(Brand brand) {
        //2.获取SqlSession
        SqlSession sqlSession = factory.openSession();
//        3.获取brandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //4.调用方法
        mapper.update(brand);

//        提交事务
        sqlSession.commit();

//        释放资源
        sqlSession.close();

    }



    //    修改
//    brand
    public void delete(int id) {
        //2.获取SqlSession
        SqlSession sqlSession = factory.openSession();
//        3.获取brandMapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //4.调用方法
        mapper.delete(id);

//        提交事务
        sqlSession.commit();

//        释放资源
        sqlSession.close();

    }

}