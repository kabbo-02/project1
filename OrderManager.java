import java.lang.*;

public class OrderManager{
	
public static Jersey getJersey(String name){
	
	if(name.equals("Argentina"))
		return new Jersey("Argentina",3500);
	
	else if(name.equals("Brazil"))
		return new Jersey("Brazil",3500);
	
	else if(name.equals("Barcelona"))
		return new Jersey("Barcelona",3500);
	
	else if(name.equals("Real Madrid"))
		return new Jersey("Real Madrid",3500);
	
	else if(name.equals("LiverPool"))
		return new Jersey("LiverPool",3500);
	
	else if(name.equals("Manchester City"))
       return new Jersey("Manchester City",3500);
   
   else if(name.equals("Manchester United"))
       return new Jersey("Manchester United",3500);
   
   else if(name.equals("Chelsea"))
       return new Jersey("Chelsea",3500);
   
   else if(name.equals("Arsenal"))
       return new Jersey("Arsenal",3500);
   
    else if(name.equals("Tottenham"))
       return new Jersey("Tottenham",3500);
	
else{ return null;
}
}
}