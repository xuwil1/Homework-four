/**
 * Train class is used to a Train. It contains a queue of the stations the train visited  
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class Train {
	private LinkedList<Station> stationList = new LinkedList<Station>(); 
	private int firstCapacity;
	private int secondCapacity;
	private int timeArrival;
/**
 * returns list of stations for train
 * @return
 */
public void enqueue(Station station) {
	stationList.add(station);
}
public LinkedList Queue() {
	return stationList;
}
/**
 * sets timeArrival
 * @param time
 */
public void setTimeArrival(int time) {
	timeArrival=time;
}
/**
 * returns timeArrival
 * @return
 */
public int getTimeArrival() {
	return timeArrival; 
}
/**
 * sets firstCapacity using user input capacity
 * @param capacity
 */
public void setFirstCapcacity(int capacity) {
	firstCapacity= capacity;
}
/**
 * sets secondCapacity using user input capacity
 * @param capacity
 */
public void setSecondCapcacity(int capacity) {
	secondCapacity= capacity;
}
/**
 * method that simulates train over time
 */
public void simulateTimeStep() {
	if(timeArrival==0) {
		Station temp=stationList.remove();
	}
	if(timeArrival==0) {
		timeArrival=5;
	}
		timeArrival--;
}		

}
