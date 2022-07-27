package com.farrukhsimran.states;

import com.farrukhsimran.cords.CordType;
import com.farrukhsimran.service.Fan;

/**
 * Implements CordType and contains four values for speed: HIGH, MEDIUM, LOW, and OFF.
 * Consider it one of the two cords of the ceiling fan that controls the speed the fan rotates.
 * 
 * @author SIMRAN
 */
public enum Speed implements CordType {

	HIGH{
		/**
		 * When the pull method is called while the value is HIGH,
		 * it sets the value to MEDIUM and outputs the change of speed.
		 * 
		 * In other words, when the fan speed is set to HIGH, 
		 * pulling the speed cord will decrease the fan speed to MEDIUM.
		 */
		public void pull(Fan service) {
			service.setSpeed(MEDIUM);
			System.out.println("Fan Speed changed to " + service.getSpeed());
		}
	},
	MEDIUM{
		/**
		 * When the pull method is called while the value is MEDIUM,
		 * it sets the value to LOW and outputs the change of speed.
		 * 
		 * In other words, when the fan speed is set to MEDIUM, 
		 * pulling the speed cord will decrease the fan speed to LOW.
		 */
		public void pull(Fan service) {
			service.setSpeed(LOW);
			System.out.println("Fan Speed changed to " + service.getSpeed());
		}
	},
	LOW{
		/**
		 * When the pull method is called while the value is LOW,
		 * it sets the value to OFF and outputs the change of speed.
		 * 
		 * In other words, when the fan speed is set to LOW, 
		 * pulling the speed cord will set the value to OFF.
		 */
		public void pull(Fan service) {
			service.setSpeed(OFF);
			System.out.println("Fan Speed changed to " + service.getSpeed());
		}
	},
	OFF{
		/**
		 * When the pull method is called while the value is OFF,
		 * it sets the value to HIGH and outputs the change of speed.
		 * 
		 * In other words, when the fan is set to OFF, 
		 * pulling the speed cord will set the fan speed to HIGH.
		 */
		public void pull(Fan service) {
			service.setSpeed(HIGH);
			System.out.println("Fan Speed changed to " + service.getSpeed());
		}
	};
	
	
	
}
