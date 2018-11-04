import java.util.Scanner;

public class Challenge03 {
	// ctrl + shift + o
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Calculator cal = new Calculator();
		
		System.out.print("integer a: ");
		int a = sc.nextInt();
		System.out.print("integer b: ");
		int b = sc.nextInt();
		
		System.out.println("µ¡¼À: " + Calculator.add(a, b));
		//System.out.println("°ö¼À: " + Calculator.mul(a, b));

	}

}
