import java.util.*;

public class Test {
public static void main(String[]args) {
		// Scanner sc= new Scanner(System.in);
		// System.out.println("Enter integer: ");
		// double j=sc.nextDouble();
		// BooleanSource b1 = new BooleanSource(j);
		// for(int i=0; i<10;i++) {
		// System.out.println(b1.occurs());
		// }
	/*
		PassengerQueue pq= new PassengerQueue();
		System.out.println(pq.isEmpty());
		System.out.println(pq.toString());
		Passenger p1= new Passenger();
		p1.setArrivalTime(0);
		p1.setIsFirstClass(true);
		pq.enqueue(p1);
		System.out.println(pq.toString());
		Passenger p2=new Passenger();
		p2.setArrivalTime(1);
		pq.enqueue(p2);
		Passenger p3=new Passenger();
		p3.setArrivalTime(2);
		pq.enqueue(p3);
		Passenger p4=new Passenger();
		p4.setArrivalTime(3);
		pq.enqueue(p4);
		System.out.println(pq.toString());
		System.out.println(pq.dequeue());
		System.out.println(pq.toString());
		System.out.println(pq.peek());
		System.out.println(pq.isEmpty());
	*/
//	Station s1 = new Station();
//	s1.setFirstArrival(.5);
//	s1.setSecondArrival(.5);
//	s1.simulateTimestep();
//	System.out.println(s1.getFirstClass().toString());
//	System.out.println(s1.getSecondClass().toString());
	LinkedList<Train> trainArray= new LinkedList<Train>();
	Station Mineola= new Station("Mineola");
	Station Hicksville = new Station("Hicksville");
	Station Syosset = new Station("Syosset");
	Station Huntington = new Station("Huntington");
	for(int i=0;i<4;i++) {
		Train s = new Train();
		s.setFirstCapcacity(7);
		s.setSecondCapcacity(15);
		s.Queue().add(Huntington);
		s.Queue().add(Syosset);
		s.Queue().add(Hicksville);
		s.Queue().add(Mineola);
		s.setTimeArrival(i*5);
		trainArray.add(s);
	}
//	}
//	int n=0;
//	while(n<2) {
//	System.out.println("Trains: ");
//	for(int i=0;i<trainArray.size();i++) {
//		int j=i+1;
//		System.out.println("j: "+j+"\ti: "+i);
//	System.out.println("Train "+ j +" will arrive at " + trainArray.get(i).Queue().peek().toString()+" in "+ trainArray.get(i).getTimeArrival()+" minutes.");
//	}
//	for(int i=0;i<trainArray.size();i++) {
		trainArray.get(0).simulateTimeStep();
		System.out.println(trainArray.get(0).Queue().toString());
		System.out.println(trainArray.get(1).Queue().toString());
		trainArray.get(2).simulateTimeStep();
		System.out.println(trainArray.get(2).getTimeArrival());
		System.out.println(trainArray.get(2).Queue().toString());
		System.out.println(trainArray.get(3).Queue().toString());
//		trainArray.get(0).simulateTimeStep();
//		trainArray.get(0).simulateTimeStep();
//		trainArray.get(0).simulateTimeStep();
//		trainArray.get(0).simulateTimeStep();
//		System.out.println(trainArray.get(0).getTimeArrival());
//		System.out.println(trainArray.get(0).Queue().toString());
//		trainArray.get(0).simulateTimeStep();
//		System.out.println(trainArray.get(0).getTimeArrival());
//		System.out.println(trainArray.get(0).Queue().toString());
//		System.out.println(trainArray.get(1).Queue().toString());
//		System.out.println(trainArray.get(2).Queue().toString());
//		System.out.println(trainArray.get(3).Queue().toString());
//	}
//	n++;

	}
	
}
