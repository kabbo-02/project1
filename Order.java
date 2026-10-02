import java.lang.*;

   public class Order{
        private User user;
        private Jersey jersey;
        private String size;

public Order(){
	System.out.println("Empty constructor for Order");
}
public Order(User user,Jersey jersey,String size){
	this.user=user;
	this.jersey=jersey;
	this.size=size;
	System.out.println("pera constructor for Order");
}

	public void setUser(User user){
		this.user=user;
	}
	public User getUser(){
		return user;
	}
	
	public void setJersey(Jersey jersey){
		this.jersey=jersey;
	}
	public Jersey getJersey(){
		return jersey;
	}
	
	public void setSize(String size){
		this.size=size;
	}
	public String getSize(){
		return size;
	}
	
	public void showOrder(){
		
 System.out.println(user.getName()+"ordered"+"\n"+jersey.getTeam()+"("+size+")");
	}
}