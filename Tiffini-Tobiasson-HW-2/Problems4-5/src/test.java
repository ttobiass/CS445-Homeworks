
public class test {
	public static void main(String[]args) {
		ImprovedRandom rand = new ImprovedRandom();
		
		int x = rand.nextInt(3,4);
		System.out.println(x);
		
		
		String str = "This is a test";
		ImprovedStringTokenizer ist = new ImprovedStringTokenizer(str);
		String[] a = ist.toArray();
		for(int i=0; i<a.length;i++) {
			System.out.println("index: " + i + " word: "+a[i]);
		}
	}
}
