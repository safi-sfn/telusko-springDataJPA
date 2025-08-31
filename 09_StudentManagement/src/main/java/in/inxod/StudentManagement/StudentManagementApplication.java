package in.inxod.StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.inxod.StudentManagement.model.Students;
import in.inxod.StudentManagement.service.StudentServiceImpl;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(StudentManagementApplication.class, args);
		
		StudentServiceImpl service = container.getBean(StudentServiceImpl.class);
		
	// For adding single Student	
/*		
		Students std = new Students();
		std.setStudentName("Mohit");
		std.setStudentAge(25);
		std.setCourse("Java");
		std.setStudentCity("Delhi");
		String status = service.addStudent(std);
		System.out.println("Status of student : "+status);

		
	// For adding multiple Data 
		
		List<Students> students = new ArrayList<>();
		students.add(new Students("Rahul Mehta", 22, "Java", "Pune"));
		students.add(new Students("Priya Sharma", 21, "Python", "Delhi"));
		students.add(new Students("Arjun Patel", 23, "Java", "Ahmedabad"));
		students.add(new Students("Sneha Kapoor", 20, "C++", "Mumbai"));
		students.add(new Students("Rohit Singh", 24, "JavaScript", "Bangalore"));
		students.add(new Students("Neha Verma", 22, "Python", "Jaipur"));
		students.add(new Students("Karan Joshi", 25, "Java", "Hyderabad"));
		students.add(new Students("Simran Kaur", 23, "C#", "Chandigarh"));
		students.add(new Students("Anjali Gupta", 21, "Java", "Lucknow"));
		students.add(new Students("Vikas Yadav", 24, "Python", "Varanasi"));
		students.add(new Students("Meena Rathi", 22, "JavaScript", "Indore"));
		students.add(new Students("Ravi Kumar", 23, "C++", "Patna"));
		students.add(new Students("Aditi Nair", 20, "Java", "Kochi"));
		students.add(new Students("Suresh Iyer", 25, "C#", "Chennai"));
		students.add(new Students("Manoj Chauhan", 26, "Python", "Bhopal"));
		students.add(new Students("Divya Menon", 22, "Java", "Thiruvananthapuram"));
		students.add(new Students("Akash Sharma", 23, "Go", "Noida"));
		students.add(new Students("Pooja Mishra", 21, "Ruby", "Kanpur"));
		
		List<Students> st = (List<Students>) service.addStudent(students);
		for(Students student : st) {
			System.out.println(student);
		}
		
*/
		
		// For updating Student
/*		
		Students student = new Students();
		student.setStudentId(24);
		student.setStudentName("Arjun Singh");
		student.setStudentAge(24);
		student.setCourse("Spring Boot");
		student.setStudentCity("Ahmedabad");
		String status = service.updateStudentDetails(student);
		System.out.println(status);
*/		
		
		// Find By Student ID
/*		
		Optional<Students> optional = service.findByStudentId(26);
		if(optional.isPresent()) {
			Students student = optional.get();
			System.out.println("Student Name   : "+student.getStudentName());
			System.out.println("Student Course : "+student.getCourse());
			System.out.println("Student City   : "+student.getStudentCity());
		}else {
			System.out.println("Student is Not Present With this ID ");
		}
*/		
		
/*	
 * 	
//		String status = service.deleteStudentById(21);
//		System.out.println(status);
		
		List<Integer> idList = new ArrayList<>();
		idList.add(1);
		idList.add(4);
		String status = service.deleteStudentWithMultipleIds(idList);
		System.out.println(status);
*/		
		
		// Find All Students By Course
		
		String course = "Java";
		service.findStudentByCourse(course);
		System.out.println("All Students find with course : "+course);
		
	}

}














