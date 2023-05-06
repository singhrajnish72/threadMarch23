package threadMarch23.LLD.prototype;

import java.util.List;

public class Student {
	
	private String name;
	private String batch;
	private List<String> courses;
	
	public Student() {
	}
	
	public Student(Student student) {
		this.name = student.getName();
		this.batch = student.getBatch();
		this.courses = student.getCourses();
	}
	
	
	public Student Copy() {
		return new Student(this);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the batch
	 */
	public String getBatch() {
		return batch;
	}

	/**
	 * @param batch the batch to set
	 */
	public void setBatch(String batch) {
		this.batch = batch;
	}

	/**
	 * @return the courses
	 */
	public List<String> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", batch=" + batch + ", courses=" + courses + "]";
	}

}
