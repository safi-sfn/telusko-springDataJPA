package in.inxod.courseEnrollment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.courseEnrollment.model.Course;
import in.inxod.courseEnrollment.repository.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo repo;
	
	@Override
	public Course addCourse(Course course) {
		
		return repo.save(course);
	}

	@Override
	public Iterable<Course> addMultipleCourse(Iterable<Course> course) {
		return repo.saveAll(course);
	}

	@Override
	public Iterable<Course> getAllCourses() {
		
		Iterable<Course> allCourse =repo.findAll();
		allCourse.forEach(course -> 
		    System.out.println(course.getCourseName()+" | "+course.getFormattedDuration()
		    		+" | "+course.getFees())
		    );
		return allCourse;
	}

	@Override
	public List<Course> getByCourseName(String courseName) {
		List<Course> course = repo.findByCourseName(courseName);
		 course.forEach(c -> 
		 			System.out.println(c.getCourseName() + " | "+c.getFormattedDuration()+" | "+c.getFees())
				 );
		return course;
	}

	@Override
	public String deleteCourse(Integer id) {
		  Optional<Course> optional = repo.findById(id);
		  if(optional.isPresent()) {
			  repo.deleteById(id);
			  return "Course Deleted";
		  }
		return "Course Not Found";
	}

	@Override
	public Iterable<Course> getCourseDurationGreaterThan(Integer duration) {
		Iterable<Course> courses = repo.findByDurationGreaterThan(duration);
		for (Course course : courses) {
			System.out.println(course.getCourseName()+" | "+course.getFees());
		}
		return courses;
	}

}
