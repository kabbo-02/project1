import java.lang.*;
public class Validator{
	public static boolean isEmpty(String text){
		return text == null || text.trim().isEmpty();
	}
}