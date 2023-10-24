package neebalgurukul.day2;

import java.util.Scanner;

public class Ques5 {

	void ques5Soln() {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
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
	}
}
