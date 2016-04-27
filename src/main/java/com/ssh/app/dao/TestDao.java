package com.ssh.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssh.app.po.TestEntity;
import com.ssh.base.dao.BaseDao;
import com.ssh.base.util.PageInfo;

@Repository
public class TestDao extends BaseDao<TestEntity,Integer>{
	private static final long serialVersionUID = 1L;

    public List<Object> listUsers(){
    	String Hql="from UserInfo where 1=1";
    	PageInfo pageInfo=new PageInfo(1,5);
    	return this.listObjectsByHql(Hql, null, pageInfo);
    	
    }
}
