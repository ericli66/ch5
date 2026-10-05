import java.util.Scanner;

public class Quadratic{
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter three intergers in the order of a, b, c for a quadradic formula.");
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a == 0) {
			System.out.println("Invalid input for a");
		} else if(Math.pow(b, 2) - 4 * a * c < 0) {
			System.out.println("no solution");
		} else {
			double ax = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			double bx = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			if (ax == bx) {
				System.out.println("x = " + ax);
			} else {
				System.out.println("ax = " + ax + " bx = " + bx);
			}
		}
	}
}

