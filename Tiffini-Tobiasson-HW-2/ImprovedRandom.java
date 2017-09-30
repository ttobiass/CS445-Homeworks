//Tiffini Tobiasson
//CS445-01 
//Homework 2 - ImprovedRandom.java
//Illinois Institute of Technology

import java.util.Random;

public class ImprovedRandom extends Random{

	private static final long serialVersionUID = 7697352079534868978L;

	public ImprovedRandom(){
		super();
	}
	
	public ImprovedRandom(long seed){
		super(seed);
	}
	
	public int nextInt(int n, int m) {
		int r=m-n;
		ImprovedRandom rand = new ImprovedRandom();
		r=n+rand.nextInt(r);
		return r;
	}
}
