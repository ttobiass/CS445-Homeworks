package TableLamp;
//Tiffini Tobiasson
//CS445-01 
//Homework 3 - TableLamp
//Illinois Institute of Technology

import Button.*;
import Lightbulb.*;

public class TableLamp {
	button but;
	public TableLamp(button b) {
		but = b;
	}
	
	public void turnOn() {
		System.out.print("Lamp turned on\n");
		but.switchOn();
	}
	
	public void turnOff() {
		System.out.print("Lamp turned off\n");
		but.switchOff();
	}
}
