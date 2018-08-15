package com.daoInteface;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.modal.Users;

@Component
public interface UsersDao  {
	
	List findAll();

}
