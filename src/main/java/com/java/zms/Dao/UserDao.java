package com.java.zms.Dao;

import com.java.zms.Domain.User;
import org.apache.ibatis.annotations.*;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Mapper
public interface UserDao{
    @Select("select * from user where id = #{id}")
    public User selectUserById(int id);

    @Select("select * from user where user_name =#{userName}")
    public List<User> selectUserByName(String userName);

    @Insert("insert into user(user_name,pwd,email,phone) values (#{user.userName},#{user.pwd},#{user.email},#{user.phone})")
    public int addUser(@Param("user") User user);

    @Update("update user set userName=#{userName},userAge=#{userAge},userAddress=#{userAddress} where id=#{id}")
    public void updateUser(@Param("user")User user);

    @Delete("delete from user where id=#{id}")
    public void deleteUser(int id);

    @Select("SELECT * FROM user")
    User findAll();
    String test();
}
