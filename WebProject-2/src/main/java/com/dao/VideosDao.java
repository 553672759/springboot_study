package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.modal.Videos;


@Component
public class VideosDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public List getVideoId(int pageNo) {
		int pageSize=10;
		String sql="select VideoId from myweb.Videos limit "+(pageNo-1)*pageSize+","+pageSize+" ";
		List<Map<String, Object>> map = jdbcTemplate.queryForList(sql);
		return map;
	}
	
	public Map getVideoNum() {
		String sql=" select count(*) from myweb.videos";
		Map map = jdbcTemplate.queryForMap(sql);
		return map;
	}
	
	public ArrayList getVideoPage(int pageNo) {
		int pageSize=10;
		String sql="select VideoId,VideoTitle,VideoImg from myweb.Videos limit "+(pageNo-1)*pageSize+","+pageSize+" ";
		System.out.println(sql);
		ArrayList list=(ArrayList) jdbcTemplate.queryForList(sql);
		//int num=list.size();
		return list;
	}
	

	public Videos GetVideos(int pageNo) {
		int pageSize=10;
		String sql="select * from myweb.Videos limit "+(pageNo-1)*pageSize+","+pageSize+" ";
		Videos video=jdbcTemplate.queryForObject(sql, Videos.class);
		return video;
	}
	
	public Object findVideo(String str) {
		String sql = "SELECT * FROM myweb.videos WHERE VideoTitle Like '%"+str+"%'";
		Log log = LogFactory.getLog(VideosDao.class);
		log.info(sql);	
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		Map map=list.get(0);
		
		return map;
	}

	

}
