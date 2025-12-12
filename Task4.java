package Lesson2;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master branch");
		Scanner sc=new Scanner(System.in);
		double x1,y1,x2,y2;
		double length;
		System.out.println("Enter the coordinates x1 and y1 of point 1");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.println("Enter the coordinates x2 and y2 of point 2");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		double len=Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
		length=Math.sqrt(len);
		System.out.println("Length of Line uing Cartesian System is "+length);
	}

}