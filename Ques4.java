package neebalgurukul.day2;

import java.util.Scanner;

public class Ques4 {
	void ques4Soln() {
		Ques4 qs4=new Ques4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter no. of bookings");
		int n=sc.nextInt();
		System.out.println("Answer: "+ qs4.peopleTravel(n));
	}
	
	int peopleTravel(int n) {
		return (n/50)*50;
	}
}
