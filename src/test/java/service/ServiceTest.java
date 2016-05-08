package service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh.sys.po.RoleInfo;
import com.ssh.sys.po.UserInfo;
import com.ssh.sys.po.UserRole;
import com.ssh.sys.service.UserInfoService;
import com.ssh.sys.service.UserRoleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-hibernate.xml"})
public class ServiceTest {
	@Resource UserInfoService userServ;
	@Test
	public void getListTest(){
		
		UserRole userrole=new UserRole();
		userrole.setUserRoleId("ur6");
		UserInfo user=new UserInfo("u3","9090");
		userrole.setUserInfo(user);
		//userServ.saveNewUser(user);
		userServ.saveNewUserRole(userrole);
		//userServ.deleteUserRole(userrole);
	}
}
