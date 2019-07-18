
public class Urlify {

	void replaceSpaces(char[]str, int truelength) {
		int spacecount = 0, index, i=0;
		//we have counted the number of spaces in the string
		for(i=0;i<truelength;i++) {
			if(str[i]== ' ') spacecount++;
			//increase the length of the string to add %20
			index = truelength + spacecount*2;
			if(truelength < str.length) str[truelength]='\0';
			for( i = truelength-1;i >=0; i--) {
				if(str[i] == ' ') {
					str[index - 1] = '0';
					str[index - 2] = '2';
					str[index - 3] = '%';
					index = index -3;
				}
				else {
					str[index - 1] = str[i];
					index--;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "I am";
		Urlify testone = new Urlify();
		testone.replaceSpaces(str.toCharArray(), 4);
	}

}
