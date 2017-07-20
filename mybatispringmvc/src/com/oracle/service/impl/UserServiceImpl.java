package com.oracle.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.UserDao;
import com.oracle.model.User;
import com.oracle.service.UserService;

@Component(value="userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	@Transactional(readOnly=true)
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

}
