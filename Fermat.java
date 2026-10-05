 import java.util.Scanner;
 
public class Fermat{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter four intergers to disprove Fermat's theorem");
	
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();
	
		if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n > 2) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else {
			System.out.println("No, that doesn't work.");
		}
	}
}
