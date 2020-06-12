package com.sowmya.sb.sbDemo.lesson;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sowmya.sb.sbDemo.course.Course;
import com.sowmya.sb.sbDemo.utils.Constants;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LessonController {

	@Autowired
	private LessonService lessonService;

	@GetMapping(Constants.GET_ALL_LESSONS)
	public List<Lessons> getAllLessons(@PathVariable String topicId, @PathVariable String courseId) {
		return lessonService.getAllLessons(courseId);
	}

	@GetMapping(Constants.GET_LESSON_BY_ID)
	public Optional<Lessons> getCourse(@PathVariable String id) {
		return lessonService.getLesson(id);
	}

	@PostMapping(value = Constants.ADD_LESSON)
	public void addCourse(@RequestBody Lessons lessons, @PathVariable String courseId, @PathVariable String topicId) {
		lessons.setCourse(new Course(courseId, "", "", topicId));
		lessonService.addLesson(lessons);
	}

	@PutMapping(value = Constants.UPDATE_LESSON)
	public void updateCourse(@RequestBody Lessons lessons, @PathVariable String topicId, @PathVariable String courseId,
			@PathVariable String id) {
		lessons.setCourse(new Course(courseId, "", "", topicId));
		lessonService.updateLesson(lessons);
	}

	@DeleteMapping(value = Constants.DELETE_LESSON)
	public void deleteCourse(@PathVariable String id) {
		lessonService.deleteLesson(id);
	}
}
