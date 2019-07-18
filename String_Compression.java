
public class String_Compression {

	public String compression(String str) {
		//create an empty string
		String compressedString = "";
		//keeps track of consecutive characters
		int countconsecutive=0;
		//go through the string
		for(int i=0; i <str.length();i++) {
			//increase count by 1 
			countconsecutive++;
			//as long as they are consecutive keep going
			if(i+1 >= str.length() ||(str.charAt(i) != str.charAt(i+1))) {
				compressedString += "" + str.charAt(i) + countconsecutive; 
				//once not consecutive reset to zero
				countconsecutive = 0;
			}
		}
		//if compressed string length is less than origian return compressed or else original
		return compressedString.length() < str.length() ? compressedString : str;
	}
	public static void main(String[] args) {
		String_Compression test1 = new String_Compression();
		System.out.println(test1.compression("aaabbcc"));
	}

}
