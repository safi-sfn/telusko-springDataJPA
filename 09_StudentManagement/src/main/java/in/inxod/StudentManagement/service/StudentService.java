package in.inxod.StudentManagement.service;

import java.util.List;
import java.util.Optional;

import in.inxod.StudentManagement.model.Students;

public interface StudentService {
	
	List<Students> addStudent(List<Students> student);
	
	String updateStudentDetails(Students student);
	
	Optional<Students> findByStudentId(Integer id);
	
	Iterable<Students> findStudentByCourse(String course);
	
	String deleteStudentById(Integer id);
	String deleteStudentWithMultipleIds(List<Integer> id);
}
