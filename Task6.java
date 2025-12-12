package Lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point1{
	private double x;
	private double y;
	public Point1(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

}
class Line1{
	private Point1 p1;
	private Point1 p2;
	
	public Line1(Point1 p1,Point1 p2) {
		this.p1=p1;
		this.p2=p2;
	}
	public double getLength() {
		double x1=p1.getX();
		double y1=p1.getY();
		double x2=p2.getX();
		double y2=p2.getY();
		return Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));
	}
	
}
public class Task6 {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master branch");
		Scanner sc=new Scanner(System.in);
		double x1,y1,x2,y2;
		int n;
		Double[] list=new Double[2];
		System.out.println("Enter the no.of. lines to check");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Enter the coordinates x1 and y1 of point 1");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.println("Enter the coordinates x2 and y2 of point 2");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		
		Point1 p1=new Point1(x1,y1);
		Point1 p2=new Point1(x2,y2);
		
		Line1 l1=new Line1(p1,p2);
		
		
		list[i]=l1.getLength();
		
		}
		
		for(double m:list) {
			System.out.println(m);
		}
		int result=list[0].compareTo(list[1]);
		if(result==0) {
		System.out.println("Both lines are equal");	
		}
		else if(result>0) {
			System.out.println("Line1 is greater");
		}
		else {
			System.out.println("Line2 is greater");
		}
		}
	
	}


