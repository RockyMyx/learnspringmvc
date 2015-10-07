package com.rocky.mvcdemo.model;

import java.util.List;

public class Course {
	private Integer courseId;
	private String title;
	private String imgPath;
	private Integer learningNum;
	private Long duration;
	private String level;
	private String levelDesc;
	private String Description;
	private List<Chapter> Chapters;
	
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public Integer getLearningNum() {
		return learningNum;
	}
	public void setLearningNum(Integer learningNum) {
		this.learningNum = learningNum;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevelDesc() {
		return levelDesc;
	}
	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public List<Chapter> getChapters() {
		return Chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		Chapters = chapters;
	}
}
