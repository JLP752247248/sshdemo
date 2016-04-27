package com.ssh.app.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssh.base.util.JsonUtil;
import com.ssh.sys.po.UserInfo;
import com.ssh.sys.service.UserInfoService;
@Controller
@RequestMapping(value="/userinfoctrl")
public class TestController {
	@Autowired
	private UserInfoService userServ;
	
	
	@RequestMapping(value="/{userId}",method=RequestMethod.GET)
	//@SetCORNResponseHeader
	public void testCtrl(@PathVariable String userId,HttpServletResponse response) throws IOException{
		//List<TestEntity> list=td.getlist();
		/*response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET");
		response.setHeader("Access-Control-Max-Age", "60");*/
		UserInfo user=userServ.getObjectById(userId);
		JsonUtil.RespondJsonString(response, user);
	}
	
	@RequestMapping(method=RequestMethod.GET )
	public void getUserInfo(HttpServletResponse response) throws IOException{
		//List<TestEntity> list=td.getlist();
		List<UserInfo> userlist=userServ.getObjectlist();
		JsonUtil.RespondJsonString(response, userlist);
	}
	@RequestMapping(value="/userinfo/{userCode}",method=RequestMethod.PUT )
	public void putUserInfo(@Valid UserInfo userinfo,HttpServletResponse response) throws IOException{
		//List<TestEntity> list=td.getlist();
		List<UserInfo> userlist=userServ.getObjectlist();
		JsonUtil.RespondJsonString(response, userlist);
	}
	
	
	
	
	@RequestMapping(value="/userinfo",method=RequestMethod.POST )
	public void postUserInfo(@RequestBody @Valid UserInfo userinfo,HttpServletResponse response) throws IOException{
		//List<TestEntity> list=td.getlist();
		Serializable s=userServ.saveNewUser(userinfo);
		
		JsonUtil.RespondJsonString(response, s);
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public void postCtrl(@RequestBody @Valid UserInfo user,HttpServletRequest request,HttpServletResponse response) throws IOException{
		//List<TestEntity> list=td.getlist();
		Serializable id=userServ.saveNewUser(user);
		JsonUtil.RespondJsonString(response, id);
	}
	
	@RequestMapping(value="/{userId}",method=RequestMethod.PUT)
	public void putCtrl(@RequestBody @Valid UserInfo user,@PathVariable String userId,HttpServletRequest request,HttpServletResponse response){
		JsonUtil.RespondJsonString(response, "");

	}
	
	@RequestMapping(value="/{userId}",method=RequestMethod.DELETE)
	public void putCtrl(@PathVariable String userId,HttpServletRequest request,HttpServletResponse response){
		JsonUtil.RespondJsonString(response, "");

	}
	
	
}
