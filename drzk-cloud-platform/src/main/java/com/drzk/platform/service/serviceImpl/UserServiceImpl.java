package com.drzk.platform.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.drzk.platform.bean.User;
import com.drzk.platform.mapper.UserMapper;
import com.drzk.platform.service.UserService;

/**
 * 用户信息服务实现层
 * @author 李君
 * 2018年3月7日
 */
@Service("drzk-cloud-platform-provider")
@Transactional
public class UserServiceImpl implements UserService 
{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getUsers() {
		return userMapper.getUsers();
	}

	@Override
	public User getUserById(String Id) {
		return userMapper.getUserById(Id);
	}

}
