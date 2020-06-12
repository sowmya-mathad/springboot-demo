package com.sowmya.sb.sbDemo.converter;

import com.sowmya.sb.sbDemo.course.Course;
import com.sowmya.sb.sbDemo.dto.CourseDto;

public class CourseConveter {

	public static Course courseDtoToEntity(CourseDto courseDto) {
		Course course = new Course(courseDto.getId(), courseDto.getName(), courseDto.getDescription(),
				courseDto.getTopicId());

		return course;
	}

	public static CourseDto entityToDto(Course course) {
		CourseDto courseDto = new CourseDto(course.getId(), course.getName(), course.getDescription(),
				course.getTopic().getId());

		return courseDto;
	}

}
