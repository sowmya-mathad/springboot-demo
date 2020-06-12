package com.sowmya.sb.sbDemo.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lessons, String> {
	public List<Lessons> findByCourseId(String courseId);
}
