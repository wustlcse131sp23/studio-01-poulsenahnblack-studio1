package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a year ");
		int year = in.nextInt();
		boolean div4 = (year%4==0);
		boolean div100 = (year%100!=0);
		boolean div400 = (year%400==0);
		boolean isLeapYear = (((div4 == true)&&(div100 == true))||((div400 == true)));
		System.out.println(year + " is a leap year: " + isLeapYear);
	}

}
