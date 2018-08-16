package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;


import com.modal.Videos;

@Component
public class VideosDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<Videos> findAll(){
		return mongoTemplate.findAll(Videos.class);
	}

	public Object add(Videos video) {
		try {
			mongoTemplate.save(video);
			return "OK";
		}catch (Exception e) {
			return e.getMessage();
		}
		
	}
	
	public String getNumber() {
		return Integer.toString(mongoTemplate.findAll(Videos.class).size());
	}

}
