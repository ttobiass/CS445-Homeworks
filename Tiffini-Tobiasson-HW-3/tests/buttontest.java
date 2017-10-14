//Tiffini Tobiasson
//CS445-01 
//Homework 3 - button and PushdownButton JUnit Tests
//Illinois Institute of Technology


package tests;
import Lightbulb.Lightbulb;
import Button.*;

import junit.framework.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;


public class buttontest extends TestCase{
	protected Lightbulb bulb = new Lightbulb();
	protected button but = new button(bulb);
	protected PushdownButton pb = new PushdownButton(bulb);
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	protected void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void teston() {
		but.switchOn();
		String expected = "Button switched to ON\nLightbulb on\n";
		assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void testoff() {
		but.switchOff();
		String expected = "Button switched to OFF\nLightbulb off\n";
		assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void testPushButtonOnOff() {
		pb.pushButton();
		String expected = "Lightbulb on\n";
		assertEquals(expected, outContent.toString());
		outContent.reset();
		pb.pushButton();
		expected = "Lightbulb off\n";
		assertEquals(expected, outContent.toString());
	}

}