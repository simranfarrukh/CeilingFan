package com.farrukhsimran.cords;

import com.farrukhsimran.service.Fan;

/**
 * A collection of types of cords (in this case, just two types of cords: Speed and Direction).
 * The Speed and Direction enums implement the CordType interface and its pull(Fan cord) method to change states.
 * 
 * @author SIMRAN
 */
public interface CordType{
	
	/**
	 * Implemented in the Speed and Direction enums. Speed and Direction values change every time the method is used. 
	 * 
	 * In other words, every time the cord is "pulled" the value of the enum will change).
	 * 
	 * @param fan
	 */
	public void pull(Fan fan);
	
}
