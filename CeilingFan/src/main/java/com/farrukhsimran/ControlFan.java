package com.farrukhsimran;
import java.util.Scanner;

import com.farrukhsimran.service.Fan;

public class ControlFan {

	private static Scanner input;

	public static void main(String[] args) {
			
		Fan service = new Fan();
		System.out.println("Current fan speed is set to " + service.getSpeed() +
				" and direction is set to " + service.getDirection());

		
		while(true) {
			System.out.println("Press 'S' to change Speed or 'D' to change Direction then Enter");
			input = new Scanner(System.in);
		
			char pull = input.next().charAt(0);
			
			if(pull == 's' || pull == 'S')
				service.pullSpeedCord();
			if(pull == 'd' || pull == 'D')
				service.pullDirectionCord();
			
			System.out.println("Fan speed is now set to " + service.getSpeed() +
					" and direction is now set to " + service.getDirection() + "\n");

		}
		
	}

}
