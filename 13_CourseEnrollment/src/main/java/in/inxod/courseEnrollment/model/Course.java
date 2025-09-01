package in.inxod.courseEnrollment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer courseId;
	private String courseName;
	private Integer duration;
	private Double fees;
	
	
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	 public String getFormattedDuration() {
	        if (duration == null) {
	            return "Duration not set";
	        }
	        return duration + " months";
	    }
	
	
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public Course(String courseName, Integer duration, Double fees) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
