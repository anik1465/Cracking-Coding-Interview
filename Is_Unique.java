
import java.util.HashSet;
import java.util.Set;

public class Is_Unique {

	
	public boolean isunique(String str) {
		//use set to hold the characters
		Set<Character> character = new HashSet<Character>();
		//for each character stored in the character array
		for(char c : str.toCharArray()) {
			//check if is is contained if so return false else add it
			if(character.contains(c)){
				return false;
			}
			else
				character.add(c);
		}
		return true;
	}
	
	boolean isuniquechars(String str) {
		//checks if it's a ascii value
		if(str.length() > 128)return false;
		//set 128 bits for all chars to be stored
		boolean charset[] = new boolean[128];
		//go through the whole string
		for(int i=0; i< str.length();i++) {
			//get the value of character
			int val = str.charAt(i);
			//if it's already stored return false otherwise true
			if(charset[val]) {
				return false;
			}
			charset[val] = true;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Is_Unique test1 = new Is_Unique();
		System.out.println(test1.isunique("testing") );
		System.out.println(test1.isuniquechars("testing") );
	}

}
