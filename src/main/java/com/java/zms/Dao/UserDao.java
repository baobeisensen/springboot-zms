package com.java.zms.Dao;

import com.java.zms.Domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface UserDao{
    @Select("select * from user where id = #{id}")
    public User selectUserById(int id);

    @Select("select * from user where userName = #{userName}")
    public List<User> selectUserByName(String userName);

    @Insert("insert into user(userName,userAge,userAddress) values (#{userName},#{userAge},#{userAddress})")
    public void addUser(User user);

    @Update("update user set userName=#{userName},userAge=#{userAge},userAddress=#{userAddress} where id=#{id}")
    public void updateUser(User user);

    @Delete("delete from user where id=#{id}")
    public void deleteUser(int id);

    @Select("SELECT * FROM user")
    User findAll();
    String test();
}
