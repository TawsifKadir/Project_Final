package classproject;

public class Author {
	private String name;
	private String emailID;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}
	public Author(String name, String emailID, int age, String gender) {
		super();
		this.name = name;
		this.emailID = emailID;
		this.age = age;
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
