package cn.com.liquanan.gradleWebDemo.service.impl;

import java.util.List;



import cn.com.liquanan.gradleWebDemo.dao.UserMapper;
import cn.com.liquanan.gradleWebDemo.pojo.User;
import cn.com.liquanan.gradleWebDemo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Override  
    public User getUserById(int userId) {
        // TODO Auto-generated method stub  
        return this.userMapper.selectByPrimaryKey(userId); 
    	
    }

	@Override
	public User getUserByAccount(String account) {
		return userMapper.getUserByAccount(account);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userMapper.getAll();
	}
	@Override
	public void updateUserById(User user) {
		// TODO Auto-generated method stub
		 this.userMapper.updateByPrimaryKey(user);
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		 this.userMapper.insert(user);
	}
	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		this.userMapper.deleteByPrimaryKey(id);
	}  
  
}  