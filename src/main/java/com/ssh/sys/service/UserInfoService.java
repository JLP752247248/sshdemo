package com.ssh.sys.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.sys.dao.UserInfoDao;
import com.ssh.sys.dao.UserInfoJdbcDao;
import com.ssh.sys.dao.UserRoleDao;
import com.ssh.sys.po.UserInfo;
import com.ssh.sys.po.UserRole;

@Service
public class UserInfoService {
	@Resource
	private UserInfoDao userDao;
	@Resource
	private UserInfoJdbcDao userDao1;
	@Resource
	private UserRoleDao urDao;
	
	
	@Transactional
	public Serializable saveNewUserRole(UserRole ur){
		
		return urDao.saveNewObject(ur);
	}
	
	@Transactional
	public void deleteUserRole(UserRole ur){
		 urDao.deleteObject(ur);
	}
	@Transactional
	public Serializable saveNewUser(UserInfo user){
		/*long  starttime=System.currentTimeMillis();
		UserInfo u1=new UserInfo("1231","");
		for(int i=0;i<1000;i++)
		{
			UserInfo u2=new UserInfo("23","23");
			u1=new UserInfo("22","23");
			userDao.saveNewObject(u1);
		}
		long  endtime=System.currentTimeMillis();
		System.out.println("time:"+(endtime-starttime));
		 return (endtime-starttime);*/
		return userDao.saveNewObject(user);
	}
	@Transactional
	public Serializable saveNewUser2(UserInfo user){
		long  starttime=System.currentTimeMillis();
		for(int i=0;i<10000;i++)
		{
			userDao.add("id23"+i,"name23"+i);
		}
		long  endtime=System.currentTimeMillis();
		System.out.println("time:"+(endtime-starttime));
		return (endtime-starttime);
	}
	@Transactional
	public List<UserInfo> getObjectlist() {
		// TODO Auto-generated method stub
		return userDao.listObjectsByHql("From UserInfo where 1=1", new String[]{});
	}
	@Transactional
	public UserInfo getObjectById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
