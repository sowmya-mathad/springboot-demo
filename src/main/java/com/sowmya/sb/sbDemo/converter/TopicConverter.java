package com.sowmya.sb.sbDemo.converter;

import com.sowmya.sb.sbDemo.dto.TopicDto;
import com.sowmya.sb.sbDemo.topic.Topic;

public class TopicConverter {

	public static Topic DtoToEntity(TopicDto topicDto) {
		Topic topic = new Topic(topicDto.getId(), topicDto.getName(), topicDto.getDescription());
		return topic;
	}

	public static TopicDto entityToDto(Topic topic) {
		TopicDto topicDto = new TopicDto(topic.getId(), topic.getName(), topic.getDescription());

		return topicDto;
	}

}
