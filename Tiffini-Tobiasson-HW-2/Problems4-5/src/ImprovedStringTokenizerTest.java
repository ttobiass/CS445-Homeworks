//Tiffini Tobiasson
//CS445-01 
//Homework 2 - ImprovedStringTokenizerTest.java JUnit Test
//Illinois Institute of Technology

import static org.junit.Assert.*;

import org.junit.Test;

public class ImprovedStringTokenizerTest {

	@Test
	public void toArrayTest() {
		String str = "This is a test";
		ImprovedStringTokenizer ist = new ImprovedStringTokenizer(str);
		String[] a = ist.toArray();
		assertEquals("This",a[0]);
		assertEquals("is",a[1]);
		assertEquals("a",a[2]);
		assertEquals("test",a[3]);
	}

}
