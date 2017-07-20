package com.oracle.dao;



import com.googlecode.ehcache.annotations.Cacheable;
import com.oracle.model.User;

public interface UserDao {
//	@Cacheable(cacheName="myehcache")
	public User getUserById(Integer id);

}
