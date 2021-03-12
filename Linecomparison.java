import java.util.Scanner;
public class Linecomparison {
	public static void main(String args[]) {

	//declaration
	double X1, X2, Y1, Y2, Lenghtofline;
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
}
}
