package threadMarch23.LLD.prototype;

public class IntelligentStudent extends Student{
	
	private String iq;
	private String mentor;
	
	public IntelligentStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IntelligentStudent(IntelligentStudent intelligentStudent) {
		/*
		 * super(intelligentStudent) doesn't create new object. It will only intialise
		 * fields present in parent class.
		 */
		super(intelligentStudent); 
		this.iq = intelligentStudent.getIq();
		this.mentor = intelligentStudent.getMentor();
	}

	@Override
	public Student Copy() {
		/*
		 * We can't call super.copy() because this will the copy method of parent class
		 * and in parent class we are creating the object of Student. Hence Intelligent
		 * object will not be created.
		 */ 
		//return super.Copy();
		
		return new IntelligentStudent(this);
	}
	
	/**
	 * @return the iq
	 */
	public String getIq() {
		return iq;
	}

	/**
	 * @param iq the iq to set
	 */
	public void setIq(String iq) {
		this.iq = iq;
	}

	/**
	 * @return the mentor
	 */
	public String getMentor() {
		return mentor;
	}

	/**
	 * @param mentor the mentor to set
	 */
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	@Override
	public String toString() {
		return "IntelligentStudent [iq=" + iq + ", mentor=" + mentor + "]";
	}
	
}
