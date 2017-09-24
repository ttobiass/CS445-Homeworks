

//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Fly 
//Illinois Institute of Technology

public class Fly extends Creature implements Flyer{
	
	String eaten;
	
	public Fly(java.lang.String name){
		super(name); //creates fly with a name 
	}
	
	public void eat(Thing aThing){
		if (aThing instanceof Creature){ //if aThing is a creature, fly will not eat it and says so
			System.out.print(this.toString() + " wont eat " + aThing.toString()+"\n");
		}
		else{ //if aThing is anything but a creature, it eats it as any other creature would 
			super.eat(aThing);
		}
	}
	
	public void move(){
		this.fly(); //implements abstract move method from creature by invoking fly method
	}
	
	public void fly(){ //implements fly method from interface flyer
		System.out.print(this.toString() + " is buzzing around in flight.\n"); 
	}
}
