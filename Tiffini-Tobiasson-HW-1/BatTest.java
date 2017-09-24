//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Bat JUnit Tests 
//Illinois Institute of Technology

import junit.framework.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;


public class BatTest extends TestCase {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected Bat bat = new Bat("bat");
	protected Thing thing = new Thing("thing");
	protected Tiger tiger = new Tiger("tiger");
	
	@Before
	protected void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testFlyerFlyInterface(){
		bat.fly();
		String expected = "bat Bat is swooping through the dark.\n";
		assertEquals(expected,outContent.toString());
	}
	
	@Test
	public void testMove(){
		bat.move();
		String expected = "bat Bat is swooping through the dark.\n";
		assertEquals(expected,outContent.toString());
	}
	
	@Test
	public void testBatCannotEatThing(){
		bat.eat(thing);
		String expected = "bat Bat wont eat thing\n";
		assertEquals(expected,outContent.toString());
	}
	
	@Test
	public void testBatCanEatCreature(){
		bat.eat(tiger);
		String expected = "bat Bat has just eaten a tiger Tiger\n";
		assertEquals(expected, outContent.toString());
	}
	

}
