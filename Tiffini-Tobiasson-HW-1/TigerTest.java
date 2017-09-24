//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Tiger JUnit Tests
//Illinois Institute of Technology

import junit.framework.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class TigerTest extends TestCase{

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected Tiger tiger = new Tiger("tiger");
	
	@Before
	protected void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	@Test
	public void testMove(){
		Tiger tiger = new Tiger("tiger");
		
		tiger.move();
		String expected = "tiger Tiger has just pounced.\n";
		assertEquals(expected,outContent.toString());
	}

}
