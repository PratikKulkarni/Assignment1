package neebalgurukul.day2;
import java.util.Scanner;

public class Ques3 {
	void ques3Soln() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter no. of days");
		int n=sc.nextInt();
		Ques3 qs3=new Ques3();
		qs3.daysToYMWD(n);
	}
	
void daysToYMWD(int n) {
		
		int yr,mon,w,days;
		yr=n/365;
		n=n%365;
		mon=n/30;
		n=n%30;
		w=n/7;
		n=n%7;
		days=n;
		System.out.println("Answer: "+yr+" Years: "+mon+" Months: "+w+" Weeks: "+days+" Days");
	}
}
