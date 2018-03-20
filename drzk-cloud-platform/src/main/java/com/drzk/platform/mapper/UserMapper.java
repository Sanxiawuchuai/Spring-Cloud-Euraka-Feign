package com.drzk.platform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.drzk.platform.bean.User;

/**
 * 用户mapper映射
 * @author 李君
 * 2018年3月7日
 */
public interface UserMapper 
{

	List<User> getUsers();
	
	User getUserById(@Param("Id") String Id);
}
