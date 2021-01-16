/**
 * PassengerQueue class extends LinkedList it is used to represent passenger objects
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class PassengerQueue extends LinkedList<Passenger>{

	protected LinkedList<Passenger> list = new LinkedList<Passenger>();
	/**
	 * adds element to end of Queue
	 * @return
	 */
	public void enqueue(Passenger p) {
		list.add(p);
	}
	/**
	 * removes first element of Queue and returns it
	 * @return
	 */
	public Passenger dequeue() {
		return list.remove();
	}
	/**
	 * returns Queue in a string
	 */
	
	public String toString() {
		String s="[";
		if(list.isEmpty()==true) {
			return s+"empty]";
		}
		for(int i=0;i<list.size();i++) {
			s+=list.get(i).toString();
			if(i!=list.size()-1) {
				s+=", ";
			}
		}
		return s;
	}
	/**
	 * returns first element of Queue without removing
	 */
	public Passenger peek() {
		return list.peekFirst();
	}
	/**
	 * returns true if Queue is empty otherwise returns false
	 */
	public boolean isEmpty(){
		if (list.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	public int getSize() {
		return list.size();
	}
}
