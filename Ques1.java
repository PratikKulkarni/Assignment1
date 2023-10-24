package neebalgurukul.day2;

import java.util.Scanner;

public class Ques1 {

	void ques1Soln() {
		// TODO Auto-generated method stub
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
	}

}
