
//Tiffini Tobiasson
//CS445-01 
//Homework 1 - Thing 
//Illinois Institute of Technology

public class Thing extends java.lang.Object {
	
	private String name; //stores the name of the Thing

	public Thing(java.lang.String argName){
		name = argName; //creates a thing with a name
	}
	
	public java.lang.String toString() {
		if (getClass().getSimpleName().equals("Thing")) //if the object is a thing, print its name
			return name;
		else //if the object is not a thing, print its name followed by its class 
			return name + " " + getClass().getSimpleName();
	}
	
}
