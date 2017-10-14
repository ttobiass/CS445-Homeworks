//Tiffini Tobiasson
//CS445-01 
//Homework 3 - PushdownButton
//Illinois Institute of Technology

package Button;

import Lightbulb.Lightbulb;

public class PushdownButton extends button{
	boolean on = false;
	
	public PushdownButton(Lightbulb lb) {
		super(lb);
	}
	
	public void pushButton() {
		if (on == false) {
			on = true; 
			bulb.on();
		}
		else {
			on = false;
			bulb.off();
		}
	}
}
