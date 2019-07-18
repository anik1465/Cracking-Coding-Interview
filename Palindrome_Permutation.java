
public class Palindrome_Permutation {
	
	public boolean ispermutationpalindrome(String str) {
		int[]table = charfrequencytable(str);
		return checkmaxoneoddcount(table);
	}
	//check no more than one character has odd count
	 boolean checkmaxoneoddcount(int[] table) {
		boolean foundodd = false;
		for(int count : table) {
			if(count %2 == 1) {
				if(foundodd)return false;
			
			foundodd = true;
			}
		}
		return true;
	}
	 
	 int getCharNumber(Character c) {
		 int a = Character.getNumericValue('a');
		 int z = Character.getNumericValue('z');
		 int val = Character.getNumericValue(c);
		 if(a <=val && val <= z) return val-a;
		 return -1;
	 }
	private int[] charfrequencytable(String str) {
		int table[] = new int[Character.getNumericValue('z')-
		                      Character.getNumericValue('a')+1];
		for(char c : str.toCharArray()) {
			int x = getCharNumber(c);
			if(x!= -1) {
				table[x]++;
			}
		}
		return table;
	}
	
	boolean ispermutation_Palindrome(String str) {
		int countodd = 0;
		//create a table with the alphabet size
		int table[]=new int[Character.getNumericValue('z')
		                    -Character.getNumericValue('a')+1];
		//go through each character
		for(char c : str.toCharArray()) {
			//get the character value
			int x = getCharNumber(c);
			//if it's a valid value add it to the table
			if(x!=-1) {
				table[x]++;
				//if it's odd increase odd count
				if(table[x] %2 == 1) { countodd++;}
				else {countodd--;}
			}
		}
		return countodd <=1;
	}
	public static void main(String[] args) {
		Palindrome_Permutation test1 = new Palindrome_Permutation();
		System.out.println(test1.ispermutationpalindrome("dad"));
		System.out.println(test1.ispermutation_Palindrome("dad"));
	}
	

}
