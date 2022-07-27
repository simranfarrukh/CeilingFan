package com.farrukhsimran.states;

import com.farrukhsimran.cords.CordType;
import com.farrukhsimran.service.Fan;

/**
 * Implements CordType and contains two values for direction: CLOCKWISE and COUNTERCLOCKWISE.
 * Consider it one of the two cords of the ceiling fan that controls the direction the fan rotates.
 * 
 * @author SIMRAN
 */
public enum Direction implements CordType{

	CLOCKWISE{
		/**
		 * When the pull method is called while the value is CLOCKWISE,
		 * it sets the value to COUNTERCLOCKWISE and outputs the change of direction.
		 * 
		 * In other words, when the fan direction is set to CLOCKWISE, 
		 * pulling the direction cord will make the fan rotate COUNTERCLOCKWISE.
		 */
		public void pull(Fan service) {
			service.setDirection(COUNTERCLOCKWISE);
			System.out.println("Fan Direction changed to " + service.getDirection());
		}
	},
	
	COUNTERCLOCKWISE{
		/**
		 * When the pull method is called while the value is COUNTERCLOCKWISE,
		 * it sets the value to CLOCKWISE and outputs the change of direction.
		 * 
		 * In other words, when the fan direction is set to COUNTERCLOCKWISE, 
		 * pulling the direction cord will make the fan rotate CLOCKWISE.
		 */
		public void pull(Fan service) {
			service.setDirection(CLOCKWISE);
			System.out.println("Fan Direction changed to " + service.getDirection());
		}
	};
	
}
