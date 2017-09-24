
//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Bat 
//Illinois Institute of Technology

public class Bat extends Creature implements Flyer{
	
	public Bat(java.lang.String name){
		super(name); //creates bat with a name
	}
	
	public void eat(Thing aThing){
		if (aThing instanceof Creature){
			super.eat(aThing); //if aThing is a creature, bat eats it as any other creature would
		}
		else if (aThing instanceof Thing) {
			System.out.print(this.toString() + " wont eat " + aThing.toString()+"\n"); //if aThing is a thing, it wont eat it and says so
		}
		else
			System.out.print("\n"); //bat is silent if aThing is neither creature or thing
	}	
	
	public void move(){
		this.fly(); //implements abstract move method from Creature class by invoking fly method
	}
	
	public void fly(){ //implements fly method from flyer interface
		System.out.print(this.toString() + " is swooping through the dark.\n"); 
	}
}
