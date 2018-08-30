package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.Inteface.IUsersDao;
import com.modal.Users;

@Component
public class UsersDao implements IUsersDao{

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
//	
//	public List<Users> findAll(){
//		
//		return mongoTemplate.findAll(Users.class);
//	}
//
//	public Object add(Users user) {
//		try {
//			mongoTemplate.save(user);
//			return "OK";
//		}catch (Exception e) {
//			return e.getMessage();
//		}
//		
//	}
//	public String getNumber() {
//		return Integer.toString(mongoTemplate.findAll(Users.class).size());
//	}
}
