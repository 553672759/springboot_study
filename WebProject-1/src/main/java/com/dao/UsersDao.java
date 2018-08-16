package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.dao.Inteface.IUsersDao;
import com.modal.Users;

@Component
public class UsersDao implements IUsersDao{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<Users> findAll(){
		
		return mongoTemplate.findAll(Users.class);
	}

	public Object add(Users user) {
		try {
			mongoTemplate.save(user);
			return "OK";
		}catch (Exception e) {
			return e.getMessage();
		}
		
	}
	public String getNumber() {
		return Integer.toString(mongoTemplate.findAll(Users.class).size());
	}
}
