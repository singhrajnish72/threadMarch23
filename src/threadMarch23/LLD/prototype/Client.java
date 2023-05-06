package threadMarch23.LLD.prototype;

import java.util.ArrayList;
import java.util.HashMap;

public class Client {
    	
	public static void main(String[] args) {
	 HashMap<String, Student> map = new HashMap<>();
	 Student student = new Student();
	 student.setBatch("May'23");
	 ArrayList<String> course = new ArrayList<>();
	 course.add("Maths");
	 course.add("Science");
	 student.setCourses(course);
	 
	 IntelligentStudent iStudent = new IntelligentStudent();
	 iStudent.setBatch("April'23");
	 ArrayList<String> iCourse = new ArrayList<>(course);
	 iCourse.add("GK");
	 iStudent.setCourses(iCourse);
	 
	/*
     * Storing sample of each type of student. when we need student object we simply
	 * fetch the sample of Student from registry and can create multiple copy of it
	 * by calling copy method.
	 */
	 map.put("Student",student);
	 map.put("iStudent",iStudent); 
	 
	 
	 //Requirement - Add 3 students to May'23 batch and 1 integlligent student to April'23 batch
	 
	 Student mayObject1 = map.get("student").Copy();
	 mayObject1.setName("Rohit");
	 
	 Student mayObject2 = map.get("student").Copy();
	 mayObject2.setName("Rahul");
	 
	 Student mayObject3 = map.get("student").Copy();
	 mayObject3.setName("Kohli");
	 
     Student aprilObject = map.get("iStudent").Copy();
     aprilObject.setName("Anamika");
	 
	 System.out.println("sample Student:"+student);
	 System.out.println("sample Student mayObject1:"+mayObject1);
	 System.out.println("sample Student mayObject2:"+mayObject2);
	 System.out.println("sample Student mayObject1:"+mayObject3);
	 
	 System.out.println("sample iStudent:"+iStudent);
	 System.out.println("sample Student aprilObject:"+aprilObject); 
	}
}
