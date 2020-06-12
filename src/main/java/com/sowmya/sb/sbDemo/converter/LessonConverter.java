package com.sowmya.sb.sbDemo.converter;

import com.sowmya.sb.sbDemo.dto.LessonsDto;
import com.sowmya.sb.sbDemo.lesson.Lessons;

public class LessonConverter {

	public static Lessons lessonDtoToEntity(LessonsDto lessonsDto) {
		Lessons lesson = new Lessons(lessonsDto.getId(), lessonsDto.getName(), lessonsDto.getDescription(),
				lessonsDto.getCourseId(), lessonsDto.getTopicId());
		return lesson;
	}

	public static LessonsDto entityToDto(Lessons lessons) {
		LessonsDto lessonsDto = new LessonsDto(lessons.getId(), lessons.getName(), lessons.getDescription(),
				lessons.getCourse().getId(), lessons.getCourse().getTopic().getId());

		return lessonsDto;
	}

}
