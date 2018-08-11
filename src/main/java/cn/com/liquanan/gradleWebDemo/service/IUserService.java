package cn.com.liquanan.gradleWebDemo.service;

import cn.com.liquanan.gradleWebDemo.pojo.User;

import java.util.List;



public interface IUserService {
	
	  User getUserById(int userId);
	  User getUserByAccount(String account);
	  List<User> getAll();
	 
	  void updateUserById(User user);
	  void addUser(User user);
	  void deleteUserById(int id);
}
