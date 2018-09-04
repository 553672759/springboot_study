package com.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.modal.Videos;
import com.dao.*;
import com.service.VideosService;


@RestController
public class VideosController {

	@Autowired
	private VideosService videosService;
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@GetMapping("find")
	public String findVideo(@RequestParam("Username") String str) {
		Map map= (Map) videosService.FindVideo(str);
		
		return map.get("VideoTitle")+"<img src="+map.get("VideoImg")+">";
	}
	
	@GetMapping("VideoPage")
	public Object getTest(@RequestParam(value = "pageNo", defaultValue = "0")int pageNo) {
		ArrayList arr=new ArrayList();
		List list=videosService.getVideoPage(pageNo);
		for(int i = 0;i<list.size();i++) {
			Map map=(Map) list.get(i);
			arr.add(map.values());
		}
		Map map=(Map) list.get(4);
		
		return map.get("VideoId")+" "+map.get("VideoTitle")+"   <img src='"+map.get("VideoImg")+"'>";
	}

}
