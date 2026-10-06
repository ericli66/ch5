import java.util.Scanner;

public class Triangle{
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the three sides of the triangle");
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a <= 0 || b <= 0 || c <= 0) {
			System.out.println("error");
		} else if(b > a + c || a > b + c || c > a + b) {
			System.out.println("You cannot form a triangle from the given lengths");
		} else {
			System.out.println("You can form a triangle from the given lengths");
		}
	}
}

