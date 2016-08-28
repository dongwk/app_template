/**
 * 
 */
package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mapper.UserMapper;
import com.app.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User get(long uid){
		return userMapper.selectByPrimaryKey(uid);
	}
}