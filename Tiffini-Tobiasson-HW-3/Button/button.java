//Tiffini Tobiasson
//CS445-01 
//Homework 3 - button
//Illinois Institute of Technology

package Button;
import Lightbulb.Lightbulb;

public class button{
	protected Lightbulb bulb;
	public button(Lightbulb lb) {
		bulb = lb;
	}
	
	public void switchOn() {
		System.out.print("Button switched to ON\n");
		bulb.on();
	}
	
	public void switchOff() {
		System.out.print("Button switched to OFF\n");
		bulb.off();
	}
}
