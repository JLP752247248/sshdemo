package com.ssh.sys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.connection.ConnectionProvider;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.base.dao.BaseDao;
import com.ssh.sys.po.UserInfo;
@Repository
public class UserInfoDao extends BaseDao<UserInfo,String >{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
public void add(final String id,final String name){
	getSession().doWork(new Work(){
		@Override
		public void execute(Connection conn) throws SQLException {
			String sql="insert into sys_userinfo(userId,userName) values(?,?)";
			PreparedStatement pre=conn.prepareStatement(sql);
			pre.setString(1, id);
			pre.setString(2, name);
			pre.executeUpdate();
		}
	});
	}
	
}
