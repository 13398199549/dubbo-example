package org.framestudy.provider.service.impl;

import javax.annotation.Resource;

import org.framestudy.api.IUserService;
import org.framestudy.models.UserInfo;
import org.framestudy.provider.repository.jpa.UserHandleRepository;
import org.springframework.stereotype.Service;

/**
 * 服务发布者接口实现
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements IUserService {
	
	@Resource
	private UserHandleRepository userHandleRepository;
	
	@Override
	public void saveUserInfo(UserInfo user)throws Exception {
		// TODO Auto-generated method stub
		userHandleRepository.save(user);
	}

	@Override
	public UserInfo getUserInfoById(Long id)throws Exception {
		// TODO Auto-generated method stub
		return userHandleRepository.findOne(id);
	}

}
