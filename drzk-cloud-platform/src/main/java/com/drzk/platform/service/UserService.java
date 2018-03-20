package com.drzk.platform.service;

import java.util.List;

import com.drzk.platform.bean.User;

/**
 * 用户服务接口
 * @author LENOVO
 * 2018年3月7日
 */
public interface UserService 
{

	 /**
	  * 获取用户列表
	  * @return
	  */
	 public List<User> getUsers();
	
	 /**
	  * 根据Id获取用户
	  * @return
	  */
	 public User getUserById(String Id);
	
	
}
