package com.rocky.mvcdemo.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.rocky.mvcdemo.model.Course;
import com.rocky.mvcdemo.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {

	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@RequestMapping(value="/viewparam", method=RequestMethod.GET)
	public String viewCourse(@RequestParam("courseId") Integer courseId,Model model){
		System.out.println("param courseId = " + courseId);
		Course course = courseService.getCourseById(courseId);
		model.addAttribute(course);
		return "course";
	}

	@RequestMapping(value="/viewrest/{courseId}", method=RequestMethod.GET)
	public String viewCourseRest(@PathVariable("courseId") Integer courseId, Map<String, Object> model) {
		System.out.println("rest courseId = " + courseId);
		Course course = courseService.getCourseById(courseId);
		model.put("course", course);
		return "course";
	}
	
	@RequestMapping(value="/viewrequest")
	public String viewCourseRequest(HttpServletRequest request) {
		Integer courseId = Integer.valueOf(request.getParameter("courseId"));
		System.out.println("request courseId = " + courseId);
		Course course = courseService.getCourseById(courseId);
		request.setAttribute("course", course);
		return "course";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.GET, params="add")
	public String CreateCourse(){
		return "course_admin/edit";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String doSave(Course course){
		System.out.println("doSave: " + ReflectionToStringBuilder.toString(course));
		course.setTitle(course.getTitle());
		course.setCourseId(1234);
		return "redirect:viewrest/" + course.getCourseId();
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public String doUploadPage(){
		return "course_admin/file";
	}
	
	@RequestMapping(value="/doUpload", method=RequestMethod.POST)
	public String doUpload(@RequestParam("file") MultipartFile file) throws IOException{
		if(!file.isEmpty()){
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("/Users/RockyMa",System.currentTimeMillis()+file.getOriginalFilename()));
		}
		return "course_admin/success";
	}
}
