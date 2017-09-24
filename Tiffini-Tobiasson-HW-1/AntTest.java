//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Ant JUnit Tests
//Illinois Institute of Technology

import junit.framework.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class AntTest extends TestCase{

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected Ant ant = new Ant("ant");
	
	@Before
	protected void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testMove(){
		ant.move();
		String expected = "ant Ant is crawling around.\n";
		assertEquals(expected, outContent.toString());
	}

}
