package org.slsale.service.user;

import org.slsale.pojo.user.User;

public interface UserService {
	/**
	 * 用户登录
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(User user)throws Exception;
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int addUser(User user)throws Exception;
}
