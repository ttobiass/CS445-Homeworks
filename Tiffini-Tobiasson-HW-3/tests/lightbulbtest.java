//Tiffini Tobiasson
//CS445-01 
//Homework 3 - Lightbulb JUnit Tests
//Illinois Institute of Technology


package tests;
import Lightbulb.Lightbulb;

import junit.framework.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class lightbulbtest extends TestCase{
	protected Lightbulb bulb = new Lightbulb();
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	protected void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void teston() {
		bulb.on();
		String expected = "Lightbulb on\n";
		assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void testoff() {
		bulb.off();
		String expected = "Lightbulb off\n";
		assertEquals(expected, outContent.toString());
	}

}
