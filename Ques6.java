package neebalgurukul.day2;

import java.util.Scanner;

public class Ques6 {
	
	void ques6Soln() {
		System.out.println("Please enter a no. to check whether it is an Armstrong no.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Ques6 qs6=new Ques6();
		qs6.ArmstrongNumber(n);
	}
	
	
	void ArmstrongNumber(int n) {
		int n1,sum=0,count=0,x;
		n1=n;
		int d=0;
		while(n1>0) {
			count++;
			n1=n1/10;
		}
		d=1;
		for(int i=1;i<count;i++) {
			d*=10;
		}
		n1=n;
		while(d>0) {
			x=n1/d;
			sum+=x*x*x;
			n1=n1%d;
			d/=10;
		}
		if(sum==n) {
			System.out.println(n+" is an Armstrong number");
		}
		else {
			System.out.println(n+" is not an Armstrong number");
		}
	}
}
