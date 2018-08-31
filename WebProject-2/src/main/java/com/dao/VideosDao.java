package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.modal.Videos;


@Component
public class VideosDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public Map getVideoId(int pageNo) {
		int pageSize=10;
		//String sql="SELECT @rowno:=@rowno+1 as rowno,r.VideoId from myweb.videos r,(select @rowno:=0) t limit 10";
		String sql="select VideoId from myweb.Videos limit "+(pageNo-1)*pageSize+","+pageSize+" ";
		Map map = jdbcTemplate.queryForMap(sql);
		return map;
	}
	public Map getVideoNum() {
		String sql=" select count(*) from myweb.videos";
		
		Map map = jdbcTemplate.queryForMap(sql);
		//JSONObject itemJSONObj = JSONObject.parseObject(JSON.toJSONString(map));
		//List list =jdbcTemplate.queryForList(sql);
		
		//String num=list.toString();
		
		return map;
	}
	
	public ArrayList getPageVideo(int pageNo) {
		int pageSize=10;
		String sql="select * from myweb.Videos limit "+(pageNo-1)*pageSize+","+pageSize+" ";
		System.out.println(sql);
		ArrayList list=(ArrayList) jdbcTemplate.queryForList(sql);
		int num=list.size();
		return list;
		
	}
	
	
	public Object add(Videos video) {
		String sql="select VideoId from myweb.videos";
		return "";
	}

	public Videos GetVideos(int pageNo) {
		int pageSize=10;
		String sql="select * from myweb.Videos limit "+(pageNo-1)*pageSize+","+pageSize+" ";
		Videos video=jdbcTemplate.queryForObject(sql, Videos.class);
		return video;
	}

	

}
