package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.modal.Videos;
import com.dao.*;
import com.service.VideosService;


@RestController
public class VideosController {

	@Autowired
	private VideosService videosService;
	
	@Autowired
	private VideosDao videosDao;

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/vvd")
	public String getDbType() {
		String sql = "SELECT * FROM myweb.videos WHERE VideoTitle Like \"%复仇者%\"";
		String sql2="SELECT * FROM myweb.videos limit 15";
		List list = jdbcTemplate.queryForList(sql2);
		Videos videos=(Videos) list.get(1);
		return videos.getVideoTitle();
		
		
		
	}
	
	@GetMapping("num")
	public String getTest() {
		Map map=videosDao.getVideoId(2);
		
		return id;
	}

}
