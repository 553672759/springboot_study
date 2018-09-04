package com.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.VideosDao;


@Component
public class VideosService {
	
	@Autowired
	private VideosDao videosDao;

	public List getVideoPage(int i) {
		return videosDao.getVideoPage(i);
	}
	
	public Object FindVideo(String str) {
		return videosDao.findVideo(str);
	}
	
}
