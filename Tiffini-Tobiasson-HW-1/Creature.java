
//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Creature 
//Illinois Institute of Technology

public abstract class Creature extends Thing {
	
	Thing eaten; //variable to keep track of the last thing creature has eaten
	boolean haveEaten=false; //boolean to determine if the creature has eaten for method whatDidYouEat
	
	
	public Creature(java.lang.String argname){
		super(argname); //creates creature with a name
	}
	
	public void eat(Thing aThing){
		eaten=aThing; //sets aThing to be the last thing creature has eaten
		haveEaten=true; //changes boolean to indicate that creature has eaten for method whatDidYouEat
		System.out.print(this.toString() + " has just eaten a " + eaten.toString()+"\n"); //prints what the creature has eaten
	}
	
	public abstract void move(); //abstract method to indicate how creatures move, to be implemented by each individual creature
	
	public void whatDidYouEat(){
		if (haveEaten){ //If the creature has eaten, print what the creature has eaten
			System.out.print(this.toString() + " has eaten a " + eaten.toString()+"\n");
		}
		else{ //if the creature has not eaten, print that creature has not eaten 
			System.out.print(this.toString() + " has had nothing to eat!\n");
		}
	}
	
}
