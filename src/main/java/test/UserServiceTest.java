package test;


import org.junit.Test;

import auth.AuthHelper;
import config.Env;
import service.UserService;
/**
 * @author: bounds
 */
public class UserServiceTest {

	
	@Test
	public void testGetUser() throws Exception {
		String accessToken=AuthHelper.getAccessToken(Env.CORP_ID, Env.CORP_SECRET);
		String userId="041023385635255833";
		UserService us=new UserService();
		us.getUser(accessToken, userId);
		
	}
	
	@Test
	public void testGetDepartmentUser() throws Exception {
		String accessToken=AuthHelper.getAccessToken(Env.CORP_ID, Env.CORP_SECRET);
		String departmentId="49488202";
		UserService us=new UserService();
		us.getDepartmentUser(accessToken, departmentId);
		
	}
	
	@Test
	public void testGetDepartmentUserDetail() throws Exception {
		String accessToken=AuthHelper.getAccessToken(Env.CORP_ID, Env.CORP_SECRET);
		String departmentId="49488202";
		
		UserService us=new UserService();
		us.getDepartmentUser(accessToken, departmentId);	
	}
	
	@Test
	public void testDepartment() throws Exception{
		String accessToken=AuthHelper.getAccessToken(Env.CORP_ID, Env.CORP_SECRET);
		UserService us=new UserService();
		us.getDepartment(accessToken);
	}
}
