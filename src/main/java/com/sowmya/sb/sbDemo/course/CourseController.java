package com.sowmya.sb.sbDemo.course;

import java.util.List;
import java.util.Optional;

import org.apache.derby.tools.sysinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sowmya.sb.sbDemo.topic.Topic;
import com.sowmya.sb.sbDemo.topic.TopicService;
import com.sowmya.sb.sbDemo.utils.Constants;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	@Autowired
	private TopicService topicService;

	@GetMapping(Constants.GET_ALL_COURSES)
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}

	@GetMapping(Constants.GET_COURSE_BY_ID)
	public Optional<Course> getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	@PostMapping(value = Constants.ADD_COURSE)
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		Optional<Topic> topic = topicService.getTopic(topicId);
		System.out.println("Topic value: " + topic.get().toString());
		course.setTopic(topic.get());
		// course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}

	@PutMapping(value = Constants.UPDATE_COURSE)
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}

	@DeleteMapping(value = Constants.DELETE_COURSE)
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
