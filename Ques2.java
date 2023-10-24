package neebalgurukul.day2;

import java.util.Scanner;
import java.io.*;

public class Ques2 {
	void ques2Soln() {
		Scanner sc=new Scanner(System.in);
		Ques2 qs2=new Ques2();
		System.out.println("Please enter a 4 digit number");
		int n=sc.nextInt();
		System.out.println("Output:"+qs2.numSwap(n));
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

}
