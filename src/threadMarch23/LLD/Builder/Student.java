package threadMarch23.LLD.Builder;

public class Student {
		
	private int id;
	private String name;
	private String address;
		
	private Student(Builder builder) {
		this.id = builder.getId();
		this.name = builder.getName();
		this.address = builder.getAddress();
	}
	
	public static Builder getBuilder() {
		return new Builder();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	static class Builder {
		private int id;
		private String name;
		private String address;
		
		public Builder() {
			// TODO Auto-generated constructor stub
		}
		
		public Student build() {
			if(Validate(this)) {
				return new Student(this);
			}
			return null;
		}
		
		public boolean Validate(Builder builder){
			return builder.getName().length() > 5 && builder.getId() != 0;
		}
		
		public int getId() {
			return id;
		}
		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		public String getName() {
			return name;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public String getAddress() {
			return address;
		}
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
	}
	
}
