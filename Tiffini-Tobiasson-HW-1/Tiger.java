//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Tiger 
//Illinois Institute of Technology

public class Tiger extends Creature{
	
	public Tiger(java.lang.String argname){ 
		super(argname);//creates tiger with a name
	}
	
	public void move() { //implementation of abstract move method from Creature class
		System.out.print(this.toString() + " has just pounced.\n");
	}
}
