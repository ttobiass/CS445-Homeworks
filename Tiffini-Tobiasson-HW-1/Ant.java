
//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Ant 
//Illinois Institute of Technology

public class Ant extends Creature{
	
	public Ant(java.lang.String name){
		super(name); //creates a ant with a name
	}
	
	public void move(){ //implements abstract move method from creature class
		System.out.print(this.toString() + " is crawling around.\n"); 
	}
}
