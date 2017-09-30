//Tiffini Tobiasson
//CS445-01 
//Homework 2 - ImprovedStringTokenizer.java
//Illinois Institute of Technology

import java.util.StringTokenizer;

public class ImprovedStringTokenizer extends StringTokenizer{

	public ImprovedStringTokenizer(String str) {
		super(str);
	}
	
	public ImprovedStringTokenizer(String str, String delim) {
		super(str, delim);
	}
	
	public ImprovedStringTokenizer(String str, String delim, boolean returnDelims) {
		super(str, delim, returnDelims);
	}
	
	public String[] toArray(){
		int count = countTokens();
		String[] a = new String[count];
		for(int i = 0; i<count;i++) {
			a[i]=nextToken();
		}
		return a;
	}

}
