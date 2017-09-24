//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Creature JUnit Tests
//Illinois Institute of Technology

import junit.framework.*;

import org.junit.Test;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class CreatureTest extends TestCase{
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	Ant ant = new Ant("ant"); //ant is our original instance of creature to test that all of the creature methods work properly. Ant is used because ant has no overloading of creature methods
	Thing thing = new Thing("thing");
	Tiger tiger = new Tiger("tiger");
	
	@Before
	public void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testtoStringWithCreature(){
		assertEquals("ant Ant", ant.toString());
	}
	
	@Test
	public void testCreatureEat(){
		ant.eat(thing);
		assertEquals(ant.toString()+ " has just eaten a " +thing.toString()+"\n", outContent.toString());
	}
	
	
	@Test
	public void testCreatureWhatDidYouEatEmpty(){
		ant.whatDidYouEat();
		assertEquals(ant.toString()+" has had nothing to eat!\n",outContent.toString());
	}
	
	@Test
	public void testCreatureWhatDidYouEatAfterEating(){
		ant.eat(thing);
		String eat = outContent.toString();
		ant.whatDidYouEat();
		assertEquals(eat+ant.toString()+" has eaten a " + thing.toString()+"\n",outContent.toString());
	}
	
}
