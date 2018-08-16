package com.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.VideosDao;
import com.modal.Users;
import com.modal.Videos;

@Component
public class VideosService {
	
	@Autowired
	private VideosDao videosDao;
	
	public List<Videos> GetAll() {
		return videosDao.findAll();
	}
	
	public String GetNumber() {
		return videosDao.getNumber();
	}
	
	public Object add(Videos v) {
		return videosDao.add(v);
	}

}
