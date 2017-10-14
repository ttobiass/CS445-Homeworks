//Tiffini Tobiasson
//CS445-01 
//Homework 3 - Main Class
//Illinois Institute of Technology

import Button.PushdownButton;
import Button.button;
import Lightbulb.Lightbulb;
import TableLamp.TableLamp;

public class MainClass {
	public static void main(String [] args) {
		System.out.println("Part (i)");
		//Write a Main class that creates a Button and then commands it to switch on and off.
		Lightbulb bulb = new Lightbulb();
		button but = new button(bulb);
		but.switchOn();
		but.switchOff();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Part (ii)");
		//Write a Main class that creates a table lamp and then commands it to switch on and off.
		TableLamp lamp = new TableLamp(but);
		lamp.turnOn();
		lamp.turnOff();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Part (iii)");
		//Replace the Button with a PushdownButton
		PushdownButton pb = new PushdownButton(bulb);
		pb.pushButton();
		pb.pushButton();
	}
}
