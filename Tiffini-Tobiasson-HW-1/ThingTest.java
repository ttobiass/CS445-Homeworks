
//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Thing JUnit Test
//Illinois Institute of Technology

import junit.framework.*;

import org.junit.Test;

public class ThingTest extends TestCase{

	@Test
	public void testThingToString() {
		Thing thing = new Thing("thing");
		assertEquals("thing", thing.toString());
	}
	
	

}
