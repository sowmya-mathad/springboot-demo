package com.sowmya.sb.sbDemo.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	@Autowired
	private LessonRepository lessonRepository;

	public List<Lessons> getAllLessons(String courseId) {
		List<Lessons> lessons = new ArrayList<Lessons>();
		lessonRepository.findByCourseId(courseId).forEach(lessons::add);
		return lessons;
	}

	public Optional<Lessons> getLesson(String id) {
		return lessonRepository.findById(id);
	}

	public void addLesson(Lessons lessons) {
		lessonRepository.save(lessons);
	}

	public void updateLesson(Lessons lessons) {
		lessonRepository.save(lessons);
	}

	public void deleteLesson(String id) {
		lessonRepository.deleteById(id);
	}
}
