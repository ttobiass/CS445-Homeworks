//Tiffini Tobiasson
//CS445-01 
//Homework 2 - tests.java : used to do non-unit testing tests
//Illinois Institute of Technology

public class tests {
	public static void main(String[]args) {
		ImprovedRandom rand = new ImprovedRandom();
		int x = rand.nextInt(3,17);
		System.out.println("Random int in the range 3-17 is: "+x);
		
		System.out.println("----------------");
		
		String str = "This is a test";
		ImprovedStringTokenizer ist = new ImprovedStringTokenizer(str);
		String[] a = ist.toArray();
		System.out.println("Input String: \"This is a test\"");
		for(int i=0; i<a.length;i++) {
			System.out.println("index: " + i + " word: "+a[i]);
		}
	}
}
