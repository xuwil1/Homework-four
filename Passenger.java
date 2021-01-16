/**
 * Passenger  class is used to represent passenger objects
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class Passenger {
	private int id;
	private int arrivalTime;
	private boolean isFirstClass;
	private static int index=1;
/**
 * default constructor for passenger class
 */
	public Passenger() {
		this.id = index;
		this.arrivalTime = 0;
		this.isFirstClass = false;
		index++;
	}

/**
 * sets id of passenger
 * @param id
 */
	public void setId(int id) {
		this.id = id;
	}
/**
 * sets arrival time of passenger
 * @param arrivalTime
 */
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
/**
 * sets the class status for passenger
 * @param isFirstClass
 */
	public void setIsFirstClass(boolean isFirstClass) {
		this.isFirstClass = isFirstClass;
	}
/**
 * gets id of passenger
 * @return
 */
	public int getId() {
		return this.id;
	}
/**
 * gets arrival time of passenger
 * @return
 */
	public int getArrivalTime() {
		return this.arrivalTime;
	}
/**
 * gets class status of passenger
 * @return
 */
	public boolean getIsFirstClass() {
		return this.isFirstClass;
	}
/**
 * returns all parameters of passenger in string
 */
	public String toString() {
		return "P"+ this.id +"@T"+ this.arrivalTime;
	}
	public int getIndex() {
		return index;
	}
}
