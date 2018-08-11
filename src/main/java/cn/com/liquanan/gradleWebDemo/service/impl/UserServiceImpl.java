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
        return this.userMapper.selectByPrimaryKey(userId);
    }

	@Override
	public User getUserByAccount(String account) {
		return userMapper.getUserByAccount(account);
	}

	@Override
	public List<User> getAll() {

		return this.userMapper.getAll();
	}
	@Override
	public void updateUserById(User user) {
		int effect=userMapper.updateByPrimaryKey(user);
		if(effect!=1){
			throw new RuntimeException("修改用户出错");
		}

	}
	@Override
	public void addUser(User user) {

		 this.userMapper.insert(user);
	}
	@Override
	public void deleteUserById(int id) {
		int effect=this.userMapper.deleteByPrimaryKey(id);
		if(effect!=1){
			throw new RuntimeException("删除用户出错");
		}
	}  
  
}  