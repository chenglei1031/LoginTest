package com.dao;

import com.model.Users;

/**
 * UsersDao 实体类
 * @author 10864
 *
 */
public interface UsersDao {
	
	/**
	 * 根据用户名查询记录
	 * @param username 用户名
	 * @return 查询结果
	 */
	public Users findByUsername(String username);
}
