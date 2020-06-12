package com.sowmya.sb.sbDemo.utils;

public interface Constants {
	static final String GET_ALL_TOPICS = "/topics";
	static final String GET_TOPIC_BY_ID = "/topics/{id}";
	static final String ADD_TOPIC = "/topics";
	static final String UPDATE_TOPIC = "/topics/{id}";
	static final String DELETE_TOPIC = "/topics/{id}";

	static final String GET_ALL_COURSES = "/topics/{id}/courses";
	static final String GET_COURSE_BY_ID = "/topics/{topicId}/courses/{id}";
	static final String ADD_COURSE = "/topics/{topicId}/courses";
	static final String UPDATE_COURSE = "/topics/{topicId}/courses/{id}";
	static final String DELETE_COURSE = "/topics/{topicId}/courses/{id}";

	static final String GET_ALL_LESSONS = "/topics/{topicId}/courses/{courseId}/lessons";
	static final String GET_LESSON_BY_ID = "/topics/{topicId}/courses/{courseId}/lessons/{id}";
	static final String ADD_LESSON = "/topics/{topicId}/courses/{courseId}/lessons";
	static final String UPDATE_LESSON = "/topics/{topicId}/courses/{courseId}/lessons/{id}";
	static final String DELETE_LESSON = "/topics/{topicId}/courses/{courseId}/lessons/{id}";
}
