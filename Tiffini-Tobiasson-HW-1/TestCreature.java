
//Tiffini Tobiasson
//CS445-01 
//Homework 1 - TestCreature 
//Illinois Institute of Technology


public class TestCreature extends java.lang.Object{

	public static final int CREATURE_COUNT=4;
	public static final int THING_COUNT=2;
	
	public TestCreature(){}
	
	public static void main(String[] args) {
		Thing[] things = new Thing[THING_COUNT+CREATURE_COUNT]; //new empty array of things 
		Creature[] creatures = new Creature[CREATURE_COUNT]; // new empty array of creatures
		
		//create instances of things
		things[0] = new Thing("Banana");
		things[1] = new Thing("Locomotive");
		
		//create instances of creatures
		creatures[0] = new Tiger("Raja");
		creatures[1] = new Ant("Flick");
		creatures[2] = new Bat("Dracula");
		creatures[3] = new Fly("Thud");
		
		//add creatures to the end of the array of things
		for (int i=THING_COUNT; i<THING_COUNT+CREATURE_COUNT; i++){
			things[i] = creatures[i-THING_COUNT];
		}
		
		System.out.println("Things:"); // heading 
		System.out.println(); //blank line
		
		//prints out the name of each thing in the thing array
		for (int i=0 ; i < THING_COUNT+CREATURE_COUNT ; i++){
			System.out.println(things[i].toString()); //print each thing, which each print one line about themselves
		}
		
		System.out.println(); //blank line
		
		System.out.println("Creatures:"); //heading
		System.out.println(); //blank line
		
		//Instances of thing and creature to test if eat works correctly for each creature implementation
		Thing thing = new Thing("thing"); 
		Creature ant = new Ant("ant");
		
		//Prints out information for each creature
		for (int i=0 ; i < CREATURE_COUNT ; i++){ 
			System.out.println(creatures[i].toString()); //prints creatures name
			creatures[i].move(); //prints how creature moves
			creatures[i].whatDidYouEat(); //prints creatures initial stomach contents
			creatures[i].eat(thing); //tries to feed creature a thing
			creatures[i].whatDidYouEat(); //prints stomach contents
			creatures[i].eat(ant); //tries to feed creature a creature
			creatures[i].whatDidYouEat(); //prints stomach contents
			System.out.println(); //blank line 
		}
		
		System.out.println(); //blank line
		
	} 

}
