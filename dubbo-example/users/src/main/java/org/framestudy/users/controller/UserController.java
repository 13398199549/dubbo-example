package org.framestudy.users.controller;

import javax.annotation.Resource;

import org.framestudy.api.IUserService;
import org.framestudy.models.Messager;
import org.framestudy.models.UserInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/users")
@RestController
public class UserController {

	@Resource
	private IUserService userServiceImpl;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	public UserInfo getUserInfoById(@PathVariable("id") String id){
		UserInfo user = null;
		try {
			user = userServiceImpl.getUserInfoById(1l);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public Messager saveUserInfo(@RequestBody UserInfo userInfo){
		Messager msg = new Messager(true,"操作成功！");
		
		try {
			userServiceImpl.saveUserInfo(userInfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			msg.setStatus(false);
			msg.setInfo("操作失败！");
		}
		return msg;
	}
	
	
}
