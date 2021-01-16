/**
 * LIRRSimulator class simulates LIRR.  
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class LIRRSimulator {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	int time=0;
	Station Mineola= new Station("Mineola");
	Station Hicksville = new Station("Hicksville");
	Station Syosset = new Station("Syosset");
	Station Huntington = new Station("Huntington");
	LinkedList<Train> trainArray= new LinkedList<Train>();
	boolean bool=true;
	System.out.println("Welcome to the LIRR Simulator, Leaving Irate Riders Regularly");
	while(bool==true) {
	//Mineola station probabilities
	try {
	System.out.println("\nMineola:");
	System.out.print("Please enter first class arrival probability: ");
	double p1= sc.nextDouble();
	Mineola.setFirstArrival(p1);
	System.out.print("Please enter second class arrival probability: ");
	double p2= sc.nextDouble();
	Mineola.setSecondArrival(p2);

	//Hicksville station probabilities
	System.out.println("\nHicksville:");
	System.out.print("Please enter first class arrival probability: ");
	p1= sc.nextDouble();
	Hicksville.setFirstArrival(p1);
	System.out.print("Please enter second class arrival probability: ");
	p2= sc.nextDouble();
	Hicksville.setSecondArrival(p2);

	//Syosset station probabilities
	System.out.println("\nSyosset:");
	System.out.print("Please enter first class arrival probability: ");
	p1= sc.nextDouble();
	Syosset.setFirstArrival(p1);
	System.out.print("Please enter second class arrival probability: ");
	p2= sc.nextDouble();
	Syosset.setSecondArrival(p2);

	//Huntington station probabilities
	System.out.println("\nHuntington:");
	System.out.print("Please enter first class arrival probability: ");
	p1= sc.nextDouble();
	Huntington.setFirstArrival(p1);
	System.out.print("Please enter second class arrival probability: ");
	p2= sc.nextDouble();
	Huntington.setSecondArrival(p2);
		bool=false;
	}catch (IllegalArgumentException e){
		System.out.print("Please enter a number between 0 and 1 for probability!");
	}
	}
	System.out.print("\nPlease enter first class capacity: ");
	int firstClassCap= sc.nextInt();
	System.out.print("\nPlease enter second class capacity: ");
	int secClassCap= sc.nextInt();
	System.out.print("\nPlease enter number of trains: ");
	int trains= sc.nextInt();
	System.out.print("\nPlease enter last arrival time of passengers: ");
	int lastTime= sc.nextInt();
	
	for(int i=0;i<trains;i++) {
		Train s = new Train();
		s.setFirstCapcacity(firstClassCap);
		s.setSecondCapcacity(secClassCap);
		s.enqueue(Huntington);
		s.enqueue(Syosset);
		s.enqueue(Hicksville);
		s.enqueue(Mineola);
		s.setTimeArrival(i*5);
		trainArray.add(s);
	}
	System.out.println("Begin Simulation: \n---------------------------------------------");
	while(time<=lastTime) {
	System.out.println("Time "+time+":\n\nStation overview:");
	System.out.println("\nMineola:");
	Mineola.simulateTimestep();
	System.out.println("Queues: ");
	System.out.println("First: "+Mineola.getFirstClass().toString());
	System.out.println("Second: "+Mineola.getSecondClass().toString());
	System.out.println("\nHicksville:");
	Hicksville.simulateTimestep();
	System.out.println("Queues: ");
	System.out.println("First: "+Hicksville.getFirstClass().toString());
	System.out.println("Second: "+Hicksville.getSecondClass().toString());
	System.out.println("\nSyosset:");
	Syosset.simulateTimestep();
	System.out.println("Queues: ");
	System.out.println("First: "+Syosset.getFirstClass().toString());
	System.out.println("Second: "+Syosset.getSecondClass().toString());
	System.out.println("\nHuntington:");
	Huntington.simulateTimestep();
	System.out.println("Queues: ");
	System.out.println("First: "+Huntington.getFirstClass().toString());
	System.out.println("Second: "+Huntington.getSecondClass().toString());

	System.out.println("Trains: ");
	for(int i=0;i<trainArray.size();i++) {
		int j=i+1;
	System.out.println("Train "+ j +" will arrive at " + trainArray.get(i).Queue().peek().toString()+" in "+ trainArray.get(i).getTimeArrival()+" minutes.");
	}
	for(int i=0;i<trainArray.size();i++) {
		trainArray.get(i).simulateTimeStep();
	}
	System.out.println("\n-------\n");
	time++;
	}
	
	Passenger dummy=new Passenger();
	int count1=0;
	int count2=0;
	int time1=0;
	int time2=0;
	System.out.println("At the end of the simulation:");
	System.out.println("A total of "+ (dummy.getId()-1)+" passengers were served.\n");
	//Mineola end data
	while(Mineola.getFirstClass().isEmpty()!=true) {
		time1+=Mineola.getFirstClass().peek().getArrivalTime();
		Mineola.getFirstClass().dequeue();
		count1++;
	}
	while(Mineola.getSecondClass().isEmpty()!=true) {
		time2+=Mineola.getSecondClass().peek().getArrivalTime();
		Mineola.getSecondClass().dequeue();
		count2++;
	}
	System.out.println("At Mineola "+ count1 +" first class passengers were served with an average wait time of "+((double)(time1/count1))+
			" minutes, " +count2+" second class passengers were served with an average wait time of "+((double)(time2/count2))+" minutes.\n");
	//reset counters
	count1=0;
	count2=0;
	time1=0;
	time2=0;
	//Hicksville end data
	while(Hicksville.getFirstClass().isEmpty()!=true) {
		time1+=Hicksville.getFirstClass().peek().getArrivalTime();
		Hicksville.getFirstClass().dequeue();
		count1++;
	}
	while(Hicksville.getSecondClass().isEmpty()!=true) {
		time2+=Hicksville.getSecondClass().peek().getArrivalTime();
		Hicksville.getSecondClass().dequeue();
		count2++;
	}
	System.out.println("At Hicksville "+ count1 +" first class passengers were served with an average wait time of "+((double)(time1/count1))+
			" minutes, " +count2+" second class passengers were served with an average wait time of "+((double)(time2/count2))+" minutes.\n");
	//reset counters
	count1=0;
	count2=0;
	time1=0;
	time2=0;
	//Syosset end data
	while(Syosset.getFirstClass().isEmpty()!=true) {
		time1+=Syosset.getFirstClass().peek().getArrivalTime();
		Syosset.getFirstClass().dequeue();
		count1++;
	}
	while(Syosset.getSecondClass().isEmpty()!=true) {
		time2+=Syosset.getSecondClass().peek().getArrivalTime();
		Syosset.getSecondClass().dequeue();
		count2++;
	}
	System.out.println("At Syosset "+ count1 +" first class passengers were served with an average wait time of "+((double)(time1/count1))+
			" minutes, " +count2+" second class passengers were served with an average wait time of "+((double)(time2/count2))+" minutes.\n");
	//reset counters
	count1=0;
	count2=0;
	time1=0;
	time2=0;
	//Huntington end data
	while(Huntington.getFirstClass().isEmpty()!=true) {
		time1+=Huntington.getFirstClass().peek().getArrivalTime();
		Huntington.getFirstClass().dequeue();
		count1++;
	}
	while(Huntington.getSecondClass().isEmpty()!=true) {
		time2+=Huntington.getSecondClass().peek().getArrivalTime();
		Huntington.getSecondClass().dequeue();
		count2++;
	}
	System.out.println("At Huntington "+ count1 +" first class passengers were served with an average wait time of "+((double)(time1/count1))+
			" minutes, " +count2+" second class passengers were served with an average wait time of "+((double)(time2/count2))+" minutes.\n");
}
}
