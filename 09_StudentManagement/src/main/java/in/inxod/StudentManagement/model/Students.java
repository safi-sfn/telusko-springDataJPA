package in.inxod.StudentManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Students {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer studentId;
	private String studentName;
	private Integer studentAge;
	private String studentCity;
	private String course;
	public Integer getStudentId() {
		return studentId;
	}
	
	
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students( String studentName, Integer studentAge, String course, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
		this.course = course;
	}
	
	
}
