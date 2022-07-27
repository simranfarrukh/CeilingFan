package com.farrukhsimran.service;

import com.farrukhsimran.states.Direction;
import com.farrukhsimran.states.Speed;

/**
 * Implements the pull(Fan cord) method from the CordType interface and
 * contains all the methods that can be implemented by the cords (Speed and Direction).
 * 
 * @author SIMRAN
 */
public class Fan {
	
	private Speed speed;
	private Direction direction;
	
	/**
	 * The intial value of the Speed enum is set to HIGH.
	 * The intial value of the Direction enum is set to CLOCKWISE.
	 */
	public Fan() {
		speed = Speed.HIGH;
		direction = Direction.CLOCKWISE;
	}

	
	/**
	 * Implemented in the pull(Fan cord) method in the Speed enum and changes the speed values of the fan.
	 * 
	 * @param s
	 */
	public void setSpeed(Speed s) {
		speed = s;
	}

	/**
	 * Implemented in the pull(Fan cord) method in the Direction enum and changes the direction values of the fan.
	 * 
	 * @param d
	 */
	public void setDirection(Direction d) {
		direction = d;
	}

	/**
	 * Implemented in the ControlFan class to print out the initial speed of the fan.
	 * 
	 * @return Speed
	 */
	public Speed getSpeed() {
		return speed;
	}

	/**
	 * Implemented in the ControlFan class to print out the initial direction the fan is rotating in.
	 * 
	 * @return Direction
	 */
	public Direction getDirection() {
		return direction;
	}
	
	/**
	 * Implemented in the ControlFan class. It sets the cord type to Speed and implements the pull method of the Speed enum.
	 */
	public void pullSpeedCord() {
		speed.pull(this);
	}
	
	/**
	 * Implemented in the ControlFan class. It sets the cord type to Direction and implements the pull method of the Direction enum.
	 */
	public void pullDirectionCord() {
		direction.pull(this);
	}	
	
}