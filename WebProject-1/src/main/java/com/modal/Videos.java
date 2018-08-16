package com.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Videos")
public class Videos {
	
	@Id
	private String id;
	
	//视频排序码
	private String VideoSort;
	
	//标题
	private String VideoTitle;
	
	//简介
	private String VideoSynopsis;
	
	//内容
	private String VideoContent;
	
	//视频图片，海报
	private String VideoImg;
	
	//视频链接
	private String VideoLink;
	
	//视频标签
	private String VideoTag;
	
	//显示排名
	private String VideoRank;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVideoSort() {
		return VideoSort;
	}

	public void setVideoSort(String videoSort) {
		VideoSort = videoSort;
	}

	public String getVideoTitle() {
		return VideoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		VideoTitle = videoTitle;
	}

	public String getVideoSynopsis() {
		return VideoSynopsis;
	}

	public void setVideoSynopsis(String videoSynopsis) {
		VideoSynopsis = videoSynopsis;
	}

	public String getVideoContent() {
		return VideoContent;
	}

	public void setVideoContent(String videoContent) {
		VideoContent = videoContent;
	}

	public String getVideoImg() {
		return VideoImg;
	}

	public void setVideoImg(String videoImg) {
		VideoImg = videoImg;
	}

	public String getVideoLink() {
		return VideoLink;
	}

	public void setVideoLink(String videoLink) {
		VideoLink = videoLink;
	}

	public String getVideoTag() {
		return VideoTag;
	}

	public void setVideoTag(String videoTag) {
		VideoTag = videoTag;
	}

	public String getVideoRank() {
		return VideoRank;
	}

	public void setVideoRank(String videoRank) {
		VideoRank = videoRank;
	}


}
