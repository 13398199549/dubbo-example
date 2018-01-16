package org.framestudy.api;

import org.framestudy.models.UserInfo;

public interface IUserService {
	/**
	 * 保存用户
	 * @param user
	 */
	public void saveUserInfo(UserInfo user) throws Exception;
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 */
	public UserInfo getUserInfoById(Long id)throws Exception;
	
}
