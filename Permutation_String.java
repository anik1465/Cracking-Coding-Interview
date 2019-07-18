import java.util.Arrays;
public class Permutation_String {

	String sort(String str) {
		char[] content = str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	public boolean ispermutation(String str,String str2) {
		if(str.length() != str2.length())return false;
		return sort(str).equals(sort(str2));
	}
	public static void main(String[] args) {
		Permutation_String string1 = new Permutation_String();
		System.out.println(string1.ispermutation("mam", "mam"));
	}

}
