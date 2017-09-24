//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Fly JUnit Tests
//Illinois Institute of Technology

import junit.framework.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class FlyTest extends TestCase{

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected Fly fly = new Fly("fly");
	protected Thing thing = new Thing("thing");
	protected Tiger tiger = new Tiger("tiger");
	
	@Before
	protected void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testFlyerFlyInterface(){
		fly.fly();
		String expected = "fly Fly is buzzing around in flight.\n";
		assertEquals(expected,outContent.toString());
	}
	
	@Test
	public void testMove(){
		fly.move();
		String expected = "fly Fly is buzzing around in flight.\n";
		assertEquals(expected,outContent.toString());
	}
	
	@Test
	public void testBatCannotEatCreature(){
		fly.eat(tiger);
		String expected = "fly Fly wont eat tiger Tiger\n";
		assertEquals(expected,outContent.toString());
	}
	
	@Test
	public void testBatCanEatThing(){
		fly.eat(thing);
		String expected = "fly Fly has just eaten a thing\n";
		assertEquals(expected, outContent.toString());
	}

}
