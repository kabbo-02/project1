import java.lang.*;

public class User{
	private String name;
	private String password;
	
	public User(){
		System.out.println("Empty constructor for user");
	}
	public User(String name, String password){
		this.name=name;
		this.password=password;
		System.out.println("perameterized constructor for user");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getpassword(){
		return password;
	}
}
	