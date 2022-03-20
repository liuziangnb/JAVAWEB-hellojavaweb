package com.Mapper;

import com.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public interface UserMapper {

     public abstract List<User> selectAll();


    @Select("select * from tb_user where id=#{id}")
    User selectById(int id);


    User select(@Param("username") String username,String password);
    User select(Collection collection);

 /*
  Mybatis 参数封装：：：：
  单个参数：单个参数又可以是如下类型
    1.POJO 类型:直接使用，属性名和 参数占位符名称一致
    2.Map 集合类型:直接使用，键名和 参数占位符名称一致
    3.Collection 集合类型:封装为Map集合：可以使用@param注解，替换Map集合中默认的arg键名
        map.put("arg0",collection)
        map.put("collection",collection集合);
    4.List 集合类型:可以使用@param注解，替换Map集合中默认的arg键名
        map.put("arg0",collection)
        map.put("collection",collection集合);
        map.put("List",List集合);
    5.Array ；封装为map集合。可以使用@param注解，替换Map集合中默认的arg键名
    map.input("arg0",数组）；
    map.put("array",数组）
    6.其他类型：直接使用

    *多个参数：封装为Map集合,，可以使用@Param 注解，替换Map集合中默认的arg建明
    map.put("arg0"，参数值1）
    map.put("param1“，参数值1）
    map.put("param2“，参数值2）
    map.put("argr1“，参数值2）

  ----------------------------------@Param("username")
    map.put("username"，参数值1）
    map.put("param1“，参数值1）
    map.put("param2“，参数值2）
    map.put("argr1“，参数值2）


    */


}
