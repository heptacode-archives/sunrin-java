import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����1?");
		int n1 = sc.nextInt();
		System.out.println("����2?");
		int n2 = sc.nextInt();
		System.out.println("����3?");
		int n3 = sc.nextInt();
		System.out.printf("ū��: %d", n3 > n2 ? n3 : (n2 > n1 ? n2 : n1));
	}

}
