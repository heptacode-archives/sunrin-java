import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1?");
		int n1 = sc.nextInt();
		System.out.println("숫자2?");
		int n2 = sc.nextInt();
		System.out.println("숫자3?");
		int n3 = sc.nextInt();
		System.out.printf("큰수: %d", n3 > n2 ? n3 : (n2 > n1 ? n2 : n1));
	}

}
