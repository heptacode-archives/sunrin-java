import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int score = sc.nextInt();
		System.out.printf("ū��: %d", score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : (score >= 60 ? "D" : "F"))));
	}
}
