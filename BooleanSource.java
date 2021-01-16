/**
 * BooleanSource  class is used to construct an object with a probability p between 0 and 1 
 * and then the occurs() method returns true p*100% of the time.
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class BooleanSource {
	private double probability;

/**
 * 
 * @param p
 * throw IllegalArgumentException if p is less than 0 or greater than 1
 * @throws IllegalArgumentException
 */
	public BooleanSource(double p) throws IllegalArgumentException {
		if (p < 0.0 || p > 1.0) {
			throw new IllegalArgumentException();
		}
		probability = p;
	}
/**
 * method returns true if Math.random() generates a number small than 
 * the probability entered by user otherwise it returns false
 * @return
 */
	public boolean occurs() {
		return (Math.random() < probability);
	}
}
