package com.marcaas.springboot.mapper;

import com.marcaas.springboot.entity.User;
import org.apache.ibatis.annotations.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * from sys_user")
    List<User> findAll();

    @Select("INSERT into sys_user(username,password,nickname,email,phone,address) " +
            "VALUES(#{username},#{password},#{nickname},#{email},#{phone},#{address})")
    Integer insert(User user);

    Integer update(User user);

    @Delete("delete from sys_user where id = #{id}")
    Integer deleteById(@Param("id") Integer id);

    @Select("select * from sys_user limit #{pageNum}, #{pageSize}")
    List<User> selectPage(Integer pageNum, Integer pageSize);

    @Select("select count(*) from sys_user")
    Integer selectTotal();
}
