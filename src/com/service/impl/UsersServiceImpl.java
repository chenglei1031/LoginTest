package com.service.impl;

import javax.annotation.Resource;

import com.dao.UsersDao;
import com.service.UsersService;

/**
 * UsersServiceImpl 实体类
 * @author 10864
 *
 */

@Service("usersService")

public class UsersServiceImpl implements UsersService {
	
	@Resource(name = "usersDao");
	private UsersDao usersDao;
	
	public UsersDao getUsersDao() {
		return usersDao;
	}
	
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}
	
	/**
	 *  根据username进行登陆验证
	 * @param Username 用户名
	 * @return 封装好的Users实体类
	 */
	public Users loginValidate(String Username) {
		
	}
}
