package cn.com.liquanan.gradleWebDemo.dao;

import cn.com.liquanan.gradleWebDemo.pojo.User;

import java.util.List;



public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
     User getUserByAccount(String account);
    List<User> getAll();
    
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}