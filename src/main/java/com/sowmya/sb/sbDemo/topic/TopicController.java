package com.sowmya.sb.sbDemo.topic;

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

import com.sowmya.sb.sbDemo.utils.Constants;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@GetMapping(Constants.GET_ALL_TOPICS)
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@GetMapping(Constants.GET_TOPIC_BY_ID)
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@PostMapping(value = Constants.ADD_TOPIC)
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@PutMapping(value = Constants.UPDATE_TOPIC)
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(topic, id);
	}

	@DeleteMapping(value = Constants.DELETE_TOPIC)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
