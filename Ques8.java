package neebalgurukul.day2;

import java.util.Scanner;

public class Ques8 {

	void ques8Soln() {
		System.out.println("Please enter the name and the no. of units");
		String name;
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		int n=sc.nextInt();
		double amount;
		Ques8 qs8=new Ques8();
		amount=qs8.calculateElectricityBill(n);
		System.out.println("Name: "+name);
		System.out.println("Units: "+n);
		System.out.println("Amount: "+amount);
	}
	
	double calculateElectricityBill(int units) {
		double amt=0;
		if(units<=100) {
			amt=4.0*amt;
		}
		else if(units<=300){
			amt=100.0*4+(units-100.0)*5;
		}
		else {
			amt=100.0*4+(200.0)*5+(units-300)*10;
		}
		if(amt>1000.0) {
			amt+=(amt*0.05);
		}
		amt+=(amt*0.18);
		return amt;
	}
}
