package com.mapper;

import com.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BrandMapper {

//插叙所有的brand
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectALl();


    @Insert("insert into tb_brand values (null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);


//    根据id查询

    @Select("select * from tb_brand where id=#{id}")
    @ResultMap("brandResultMap")
    Brand selectById(int id);


//    修改操作
@Update("update tb_brand set brand_name=#{brandName}," +
        "company_name = #{companyName},ordered = #{ordered}," +
        "description = #{description},status = #{status} where id = #{id}")
    void update(Brand brand);


//删除功能
    @Delete("delete  from tb_brand where id=#{id}")
    void delete(int id);


}
