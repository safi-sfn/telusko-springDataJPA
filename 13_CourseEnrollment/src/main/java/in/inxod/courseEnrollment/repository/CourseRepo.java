package in.inxod.courseEnrollment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.inxod.courseEnrollment.model.Course;


public interface CourseRepo extends CrudRepository<Course, Integer> {

	//Custom finder method
	
	public List<Course> findByCourseName(String courseName);
	
	Iterable<Course> findByDurationGreaterThan(Integer duration);
}
