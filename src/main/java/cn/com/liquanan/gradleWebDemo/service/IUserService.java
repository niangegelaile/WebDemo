package cn.com.liquanan.gradleWebDemo.service;

import cn.com.liquanan.gradleWebDemo.pojo.User;

import java.util.List;



public interface IUserService {
	
	 public User getUserById(int userId);
	 public User getUserByAccount(String account);
	 public List<User> getAll();
	 
	 public void updateUserById(User user);
	 public void addUser(User user);
	 public void deleteUserById(int id);
}
