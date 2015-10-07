package com.rocky.mvcdemo.serviceImpl;

import org.springframework.stereotype.Service;

import com.rocky.mvcdemo.model.Course;
import com.rocky.mvcdemo.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	public Course getCourseById(Integer courseId) {
		Course course = new Course();
		course.setCourseId(courseId);
		course.setTitle("SpringMvc");
		course.setLearningNum(10);
		return course;
	}
	
}
