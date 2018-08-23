package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modal.Videos;
import com.service.VideosService;
import com.util.Util;

@RestController
public class VideosController {

	@Autowired
	private VideosService videosService;
	
	@Autowired
	Util util;
	
	@GetMapping("GetVideos")
	public List GetAll() {
		return videosService.GetAll();
	}
	
	@GetMapping("GetVideosNumber")
	public String GetVideosNumber() {
		return videosService.GetNumber();
	}
	
//	@GetMapping("AddVideos")
//	public Object AddVideos() {
//		Videos videos=new Videos();
//		videos.setId(util.GetUUID());
//		videos.setVideoTitle("谍影重重");
//		return videosService.add(videos);
//	}
	
}
