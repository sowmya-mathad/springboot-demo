package com.sowmya.sb.sbDemo.dto;

import com.sowmya.sb.sbDemo.dto.CourseDto;

public class LessonsDto {
	private String id;
	private String name;
	private String description;
	private String courseId;
	private String topicId;
	
	public String getCourseId() {
		return courseId;
	}

	public void setCourse(String courseId) {
		this.courseId = courseId;
	}

	public LessonsDto() {
	}

	public LessonsDto(String id, String name, String description, String courseId, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.courseId = courseId;
		this.setTopicId(topicId);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

}
