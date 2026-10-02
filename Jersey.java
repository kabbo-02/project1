import java.lang.*;

public class Jersey{
	private String team;
	private int price;
	
	public Jersey(){
		System.out.println("empty cons for jersey");
	}
	public Jersey(String team,int price){
		this.team=team;
		this.price=price;
		System.out.println("pera cons for jersey");
	}
	public void setTeam(String team){
		this.team=team;
	}
	public String getTeam(){
		return team;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
}