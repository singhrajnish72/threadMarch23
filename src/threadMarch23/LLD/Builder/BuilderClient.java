package threadMarch23.LLD.Builder;

import threadMarch23.LLD.Builder.Student.Builder;

public class BuilderClient {
	 public static void main(String args[]) {	
		 Builder builder = Student.getBuilder();	
		 Student s = builder.setId(16)
		       .setName("Rajn")
		       .setAddress("Darbhanga")
		       .build();
		
		System.out.println("Student1:"+s);
	 }	
}
