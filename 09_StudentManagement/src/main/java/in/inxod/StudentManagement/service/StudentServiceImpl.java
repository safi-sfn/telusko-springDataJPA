package in.inxod.StudentManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.StudentManagement.model.Students;
import in.inxod.StudentManagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	StudentRepository repo;
	
	@Autowired
	public StudentServiceImpl(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Students> addStudent(List<Students> students) {
	        return (List<Students>)repo.saveAll(students);

	}

	@Override
	public String updateStudentDetails(Students student) {
		Optional<Students> optional = repo.findById(student.getStudentId());
		
		if(optional.isPresent()) {
			Students present = optional.get();
			present.setStudentName(student.getStudentName());
			present.setStudentAge(student.getStudentAge());
			present.setStudentCity(student.getStudentCity());
			present.setCourse(student.getCourse());
			 repo.save(present);
			 
			 return "Student updated successfully with ID: " + present.getStudentId();
			
		}else {
			return "Student not found with ID: " + student.getStudentId();
		}
		
	}

	
	@Override
	public Optional<Students> findByStudentId(Integer id) {
			Optional<Students> optional = repo.findById(id);
		return optional;
	}

	
	
	@Override
	public String deleteStudentById(Integer id) {
		Optional<Students> optional = repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "Student Deleted Successfully with ID : "+id;
		}
		return "Student is Not Present for Delete with this ID : "+id;
	}

	@Override
	public String deleteStudentWithMultipleIds(List<Integer> id) {
		List<Students> list = (List<Students>)repo.findAllById(id);
		int totalId = id.size();
		int totalStudent = list.size();
		
//		if(totalId == totalStudent) {
//			repo.deleteAllById(id);
//			return "Students Deleted Successfully";
//		}
		
		if(totalStudent>0) {
			repo.deleteAllById(id);
			return "Students Deleted Successfully";
		}
		return "Deletion failure";
		
		
	}

	
	
	
	
	@Override
	public Iterable<Students> findStudentByCourse(String course) {
		Iterable<Students> student = repo.findAllByCourse(course);
		for(Students st : student) {
			System.out.println("Student ID   : "+st.getStudentId());
			System.out.println("Student Name : "+st.getStudentName());
			System.out.println("Student City : "+st.getStudentCity());
		}
		return student;
	}

}

























