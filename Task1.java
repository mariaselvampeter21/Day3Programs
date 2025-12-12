package Lesson2;

import java.util.Scanner;

public class Task1 {
	private static final int hoursPerday=8;
	private static final int parttimehoursPerday=4;
	private static final int wagePerHour=20;

	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int option;
		System.out.println("Employement Type");
		System.out.println("1.FullTime");
		System.out.println("2.PartTime");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of Employment");
		option=sc.nextInt();
		int present=1, wages;
		double random=Math.floor(Math.random()*10)%2;
		
		switch(option) {
		case 1:
						
			if(present==random) {
				System.out.println("Employee is present for FullTime");
				wages=wagePerHour*hoursPerday;
				System.out.println("The wages for this month: "+wages);
			}
			else {
				System.out.println("Employee is Absent so No paid Leave is available");
			}
			break;
		case 2:
			
			if(present==random) {
				System.out.println("Employee is present for PartTime");
				wages=wagePerHour*parttimehoursPerday;
				System.out.println("The wages for this day: "+wages);
			}
			else {
				System.out.println("Employee is Absent so No paid Leave is available");
			}
			break;
		}
		
		}
		

}
