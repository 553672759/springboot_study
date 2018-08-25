package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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
	
	//分页查找数量
	public long countSample(String id) {
        Query query = new Query();
        if (id!=null)
            query.addCriteria(Criteria.where("creator").is(id));
 
        return mongoTemplate.count(query, Videos.class);
    }
	
	public List<Sample> searchAllSample(String id, PageTag page) {
	       Query query = new Query();
	       query.with(new Sort(new Sort.Order(Sort.Direction.DESC, "update_date")));
	       int skip = (page.getCurrentPage() - 1) * page.getPageSize();
	       if (StringUtil.hasText(id)) {
	           Criteria criteria = Criteria.where("creator").is(id);
	           query.addCriteria(criteria);
	       }
	       query.skip(skip);// 从那条记录开始
	       query.limit(page.getPageSize());// 取多少条记录
	       return mongoTemplate.find(query, Sample.class);
	   }
	
	public void modifyHitNumByNo(String no) {
	       Query query = new Query();
	       query.addCriteria(Criteria.where("sap_no").is(no));
	       Update update = new Update();
	       update.inc("hit_num", 1);
	       mongoTemplate.updateFirst(query, update, Project.class);
	   }

}
