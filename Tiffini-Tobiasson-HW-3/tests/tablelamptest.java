//Tiffini Tobiasson
//CS445-01 
//Homework 3 - TableLamp JUnit Tests
//Illinois Institute of Technology


package tests;
import Lightbulb.Lightbulb;
import TableLamp.TableLamp;
import Button.*;

import junit.framework.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;


public class tablelamptest extends TestCase{
	protected Lightbulb bulb = new Lightbulb();
	protected button but = new button(bulb);
	protected TableLamp lamp = new TableLamp(but);
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	protected void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void teston() {
		lamp.turnOn();
		String expected = "Lamp turned on\n" + "Button switched to ON\n" + "Lightbulb on\n";
		assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void testoff() {
		lamp.turnOff();
		String expected = "Lamp turned off\n" + "Button switched to OFF\n" + "Lightbulb off\n";
		assertEquals(expected, outContent.toString());
	}
}