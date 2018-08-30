package com.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.VideosDao;


@Component
public class VideosService {
	
	@Autowired
	private VideosDao videosDao;


}
