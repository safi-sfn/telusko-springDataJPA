package in.inxod.courseEnrollment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.inxod.courseEnrollment.model.Course;
import in.inxod.courseEnrollment.service.CourseServiceImpl;

@SpringBootApplication
public class CourseEnrollmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(CourseEnrollmentApplication.class, args);
		
		CourseServiceImpl service = container.getBean(CourseServiceImpl.class);
		
		Course course = new Course("Java Fundamentals", 3, 8000.0);
		
//		Course c = service.addCourse(course);
//		System.out.println("Course Added : "+ c.getCourseName() +" | "+c.getFormattedDuration() +" | "+c.getFees());
		
/*		
		List<Course> courses = new ArrayList<>();
		courses.add(new Course("Python for Data Science", 3, 14000.0));
		courses.add(new Course("Machine Learning Basics", 4, 22000.0));
		courses.add(new Course("Cyber Security Fundamentals", 2, 11000.0));
		service.addMultipleCourse(courses);
*/
	
		// Get All Courses
//		service.getAllCourses();
		
		
		// Find by course Name
		
//		service.getByCourseName("Advanced Java");
		
		// Delete Course
//		String status = service.deleteCourse(12);
//		System.out.println(status);
		
		//course with duration greater than given value	
//		service.getCourseDurationGreaterThan(3);
		
		
		
		
		
		
		
		
		
		
		
	}

}
