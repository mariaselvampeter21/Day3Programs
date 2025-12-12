package Lesson2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
	private static final int hoursPerday=8;
	private static final int parttimehoursPerday=4;
	private static final int wagePerHour=20;
	private static final int dayPerMonth=20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int option;
		System.out.println("Employement Type");
		System.out.println("1.FullTime");
		System.out.println("2.PartTime");
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the type of Employment");
//		option=sc.nextInt();
		int present=1, dailywages=0,monthlywages=0,day;
		Random random = new Random();
		int randomnum=random.nextInt(2);
		for(day=1;day<=dayPerMonth;day++) {
		switch(randomnum) {
		case 1:
			dailywages=wagePerHour*hoursPerday;
			break;
		case 2:
			dailywages=wagePerHour*parttimehoursPerday;
			break;
		default:
			dailywages=0;
			break;
		}
		monthlywages+=dailywages;
		
		}
		System.out.println("The Monthly wages for this month"+monthlywages);
		
	}
}
