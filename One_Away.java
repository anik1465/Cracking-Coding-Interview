
public class One_Away {

	boolean oneaway(String first, String second) {
		// replace
		if (first.length() == second.length())
			return oneedit_replace(first, second);
		// insert
		else if (first.length() + 1 == second.length())
			oneedit_insert(first, second);
		// remove
		else if (first.length() - 1 == second.length())
			oneedit_insert(first, second);
		return false;

	}
//check if you can insert a character in the first string to make the second
	 boolean oneedit_insert(String first, String second) {
		 //keep track of each index
		int index1 =0;
		int index2 = 0;
		while(index2 < second.length() && index1 < first.length()) {
			if(first.charAt(index1)!= second.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			}
			
			else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	private boolean oneedit_replace(String str, String str2) {
		boolean founddifference = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str2.charAt(i)) {
				if (founddifference) {
					return false;
				}
				founddifference = true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		One_Away test1 = new One_Away();
		System.out.println(test1.oneaway("pale", "ple"));
	}

}
