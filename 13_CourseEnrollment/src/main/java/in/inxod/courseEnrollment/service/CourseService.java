package in.inxod.courseEnrollment.service;

import java.util.List;

import in.inxod.courseEnrollment.model.Course;

public interface CourseService {
	
	// Save Course
	public Course addCourse(Course course);
	public Iterable<Course> addMultipleCourse(Iterable<Course> course);
	
	// Get all Course
	public Iterable<Course> getAllCourses();
	
	
	// find course by Name
	public List<Course> getByCourseName(String courseName);
	
	
	// delete course
	public String deleteCourse(Integer id);
	
	
	// find course with duration greater than given value
	public Iterable<Course> getCourseDurationGreaterThan(Integer duration);
}
