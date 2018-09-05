package com.dao;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.controller.LoginController;
import com.modal.Users;

@Component
public class UsersDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	
	public Object add(Users user) {
		String sql="insert into myweb.users VALUES('"+UUID.randomUUID().toString()+"','"+user.getUserName()+"','"+user.getPassWord()+"','"+user.getUserName()+"','"+user.getEmail()+"')";
		System.out.println(sql);
		//---------------日志的使用---------------------
		Log log = LogFactory.getLog(UsersDao.class);
		log.info(sql);	
		log.error(sql);
        log.debug(sql);
		//----------------------------------------------
		jdbcTemplate.update(sql);
		return true;
	}
	
	public List getAllUser() {
		String sql="select UserName from myweb.Users";
		List list=jdbcTemplate.queryForList(sql);
		return list;
		
	}
	
	public Object checkLogin(String username,String password) {
		String sql="select * from myweb.Users where username='"+username+"'";
		
		Log log = LogFactory.getLog(LoginController.class);
		log.info("===="+sql);
		
		List<Map<String, Object>> list=jdbcTemplate.queryForList(sql);
		Map map=list.get(0);
		System.out.println("=="+map.get("PassWord")+"=="+password);
		if(map.get("PassWord").toString().equals(password)) {
			return map;
		}else {
			return false;
		}
	}
}
	
	

