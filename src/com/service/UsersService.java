package com.service;
/**
 * UsersService 接口
 * @author 10864
 *
 */
public interface UsersService {
	/**
	 *  根据username进行登陆验证
	 * @param Username 用户名
	 * @return 封装好的Users实体类
	 */
	public Users loginValidate(String Username);
}
