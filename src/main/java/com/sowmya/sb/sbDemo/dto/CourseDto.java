package com.sowmya.sb.sbDemo.dto;


import com.sowmya.sb.sbDemo.dto.TopicDto;


public class CourseDto {
	
	private String id;
	private String name;
	private String description;
	private String topicId;

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public CourseDto() {
	}

	public CourseDto(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topicId = this.id;
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

}
