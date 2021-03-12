import java.util.Scanner;
public class Linecomparisonuc2 {
	public static void main(String args[]) {

	//declaration
	double X1, X2, Y1, Y2, Lenghtofline , Lenghtofline2;
	Scanner scan = new Scanner(System.in);
	//I/P FROM USER
	System.out.println("Enter point of X1");
	X1 = scan.nextDouble();
	System.out.println("Enter point of X2");
        X2 = scan.nextDouble();
	System.out.println("Enter point of Y1");
        Y1 = scan.nextDouble();
	System.out.println("Enter point of Y2");
        Y2 = scan.nextDouble();
	
	Lenghtofline = Math.sqrt( (Math.pow((X2-X1),2)) + (Math.pow((Y2-Y1),2)) );
	System.out.println(Lenghtofline);
	
	System.out.println("Enter point of X1");
	X1 = scan.nextDouble();
	System.out.println("Enter point of X2");
        X2 = scan.nextDouble();
	System.out.println("Enter point of Y1");
        Y1 = scan.nextDouble();
	System.out.println("Enter point of Y2");
        Y2 = scan.nextDouble();
	
	Lenghtofline2 = Math.sqrt( (Math.pow((X2-X1),2)) + (Math.pow((Y2-Y1),2)) );
	System.out.println(Lenghtofline2);
	
	String s1,s2;
		s1=Double.toString(Lenghtofline);
		s2=Double.toString(Lenghtofline2);
	        System.out.println("Equality of two length is: " + s1.equals(s2));
}
}
