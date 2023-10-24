package neebalgurukul.day2;

import java.util.Scanner;

public class Ques7 {

	void ques7Soln() {
		System.out.println("Please enter time in 24-hour format");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Ques7 qs7=new Ques7();
		qs7.time24toTime12(n);
	}
	
	void time24toTime12(int n) {
		int d=1000;
		int n1,n2;
		n1=n/100;
		//n1=n1%12;
		n2=n%100;
		if(n1>=12) {
			n1=n1%12;
			System.out.println("The no. in 12-hr format is: " + n1+":"+n2+"pm");
		}
		else {
			System.out.println("The no. in 12-hr format is: " + n1+":"+n2+"am");
		}
	}
}

