package neebalgurukul.day1;

import java.util.Scanner;

public class AssignmentSolutions {

	public static void main(String[] args) {
		//Code for the solution of the first problem 
		System.out.println("Please enter milliseconds");
		Scanner sc=new Scanner(System.in);
		int ms=sc.nextInt();
		int hr,min,sec;
		hr=ms/(1000*60*60);
		ms=ms%(1000*60*60);
		min=ms/(1000*60);
		ms=ms%(1000*60);
		sec=ms/1000;
		System.out.println(hr + ": " + min + ": " + sec);
		AssignmentSolutions as=new AssignmentSolutions();
		
		
		//Code for the solution of the second problem
		System.out.println("Please enter a 4 digit number");
		int n=sc.nextInt();
		System.out.println("Output:"+as.numSwap(n));
		
		
		//Code for the solution of the third problem
		System.out.println("Please enter no. of days");
		n=sc.nextInt();
		as.daysToYMWD(n);
		
		
		//Code for the solution of the fourth problem
		System.out.println("Please enter no. of bookings");
		n=sc.nextInt();
		System.out.println("Answer: "+ as.peopleTravel(n));
		
		
		//Code for the solution of the fifth problem
		int num1,num2,num3;
		System.out.println("Please enter 3 no.s");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("The largest no. is: "+ num1);
			}
			else {
				System.out.println("The laArmstrongNumberrgest no. is: "+ num3);
			}
		}
		else {
			if(num2>num3) {
				System.out.println("The largest no. is: "+ num2);
			}
			else {
				System.out.println("The largest no. is: "+ num3);
			}
		}
		
		
		//Code for the solution of the sixth problem
		System.out.println("Please enter a no. to check whether it is an Armstrong no.");
		n=sc.nextInt();
		as.ArmstrongNumber(n);
		
		
		//Code for the solution of the seventh problem
		System.out.println("Please enter time in 24-hour format");
		n=sc.nextInt();
		as.time24toTime12(n);
		
		
		//Code for the solution of the eighth problem
		System.out.println("Please enter the name and the no. of units");
		String name;
		name=sc.next();
		n=sc.nextInt();
		double amount;
		amount=as.calculateElectricityBill(n);
		System.out.println("Name: "+name);
		System.out.println("Units: "+n);
		System.out.println("Amount: "+amount);
	}
	
	int numSwap(int n) {
		int d=1000;
		int[] a=new int[4];
		a[0]=n/d;
		n=n%d;
		d=d/10;
		a[1]=n/d;
		n=n%d;
		d=d/10;
		a[2]=n/d;
		n=n%d;
		d=d/10;
		a[3]=n/d;
		n=n%d;
		d=d/10;
		d=1000;
		int num=a[2]*d+a[3]*(d/10)+a[0]*(d/100)+a[1]*(d/1000);
		return num;
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

int peopleTravel(int n) {
	return (n/50)*50;
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
