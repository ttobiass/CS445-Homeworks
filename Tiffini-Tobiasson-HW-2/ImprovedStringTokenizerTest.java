//Tiffini Tobiasson
//CS445-01 
//Homework 2 - ImprovedStringTokenizerTest.java JUnit Test
//Illinois Institute of Technology

import junit.framework.*;

import org.junit.Test;

public class ImprovedStringTokenizerTest extends TestCase{
	String str = "This is a test";	
	ImprovedStringTokenizer ist = new ImprovedStringTokenizer(str);

	@Test
	public void testtoArray() {
		String[] a = ist.toArray();
		assertEquals("This",a[0]);
		assertEquals("is",a[1]);
		assertEquals("a",a[2]);
		assertEquals("test",a[3]);
	}

}
