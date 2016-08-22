package com.luo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.luo.bean.User;
import com.luo.dao.UserDao;


@Component(value="us")
public class UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}
	@Resource(name="ud")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//@Transactional(propagation=Propagation.REQUIRED)
	public void save(User user) {
		userDao.save(user);
	}
	
	//@Transactional
	public void getUserAll() {
		userDao.getUserAll();
	}
}
