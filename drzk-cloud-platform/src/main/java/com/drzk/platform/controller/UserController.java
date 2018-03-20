package com.drzk.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drzk.platform.bean.User;
import com.drzk.platform.common.ServerResponse;
import com.drzk.platform.service.UserService;

/**
 * 用户控制层
 * @author 李君
 * 2018年3月8日
 */
@RestController
@RequestMapping(value = "/drzk/user")
public class UserController 
{

	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/list")
	public ServerResponse<List<User>> getUsers() 
	{
		List<User> list = userService.getUsers();
		
		return ServerResponse.createBySuccess( "获取用户列表成功！", list );
	}
	
	@GetMapping(value = "/get")
	//@Cacheable(value="user-key")
	public ServerResponse<User> getUsertById( @RequestParam( value = "Id" ) String Id )
	{
		User user = userService.getUserById(Id);
		return ServerResponse.createBySuccess( "获取用户成功！", user );
	}
}
