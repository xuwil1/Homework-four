/**
 * Station class is used to a station. It contains two queues and two boolean instances 
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class Station {
	private int time=0;
	private PassengerQueue firstClass=new PassengerQueue();
	private PassengerQueue secondClass=new PassengerQueue();
	private BooleanSource firstArrival;
	private BooleanSource secondArrival;
	private String name;
/**
 * constructs station with name 	
 * @param name
 */
public Station(String name) {
	this.name=name;
}
/**
 * returns firstClass PassengerQueue
 * @return
 */
public PassengerQueue getFirstClass() {
	return firstClass;
}
/**
 * returns secondClass PassengerQueue
 * @return
 */
public PassengerQueue getSecondClass() {
	return secondClass;
}
/**
 * sets firstArrival probability using data input from user
 * @param p
 */
public void setFirstArrival(Double p) {
	firstArrival=new BooleanSource(p);
}
/**
 * sets secondArrival probability using data input from user
 * @param p
 */
public void setSecondArrival(Double p) {
	secondArrival= new BooleanSource(p);
}
/**
 * method that simulates station over time
 */
public void simulateTimestep() {
	if(firstArrival.occurs()== true) {
		Passenger temp = new Passenger();
		temp.setArrivalTime(time);
		temp.setIsFirstClass(true);
		firstClass.enqueue(temp);
		System.out.println("First class passenger ID "+(temp.getIndex()-1)+ " arrives");
	}else {
		System.out.println("No first class passenger arrives");
	}
	if(secondArrival.occurs()==true) {
		Passenger temp = new Passenger();
		temp.setArrivalTime(time);
		secondClass.enqueue(temp);
		System.out.println("Second class passenger ID "+ (temp.getIndex()-1)+ " arrives");
	}else {
		System.out.println("No second class passenger arrives");
	}
	time++;
}
/**
 * returns station name
 */
public String toString() {
	return name;
}
}
