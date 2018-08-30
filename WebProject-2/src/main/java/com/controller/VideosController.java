package com.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dao.VideosDao;
import com.service.VideosService;
import com.util.Util;

@RestController
public class VideosController {

	@Autowired
	private VideosService videosService;

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/vvd")
	public List<Map<String, Object>> getDbType() {
		String sql = "SELECT * FROM myweb.videos WHERE VideoTitle Like \"%复仇者%\"";
		List list = jdbcTemplate.queryForList(sql);
		
		return list;
	}

}
