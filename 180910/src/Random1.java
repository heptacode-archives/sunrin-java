import java.util.Random;
import java.util.Scanner;

public class Random1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int rn = rd.nextInt(100);
		System.out.println("### ���� ���߱� ���� ###\n0~99 �ڿ��� �� �ϳ��� �Է��ϼ���.");
		for(int i = 1; true; i++) {
			System.out.printf("%d��° ���� >> ", i);
			int n = sc.nextInt();
			if(n == rn) {
				System.out.printf("%d��°�� �õ��� �����ϼ̽��ϴ�!", i);
				break;
			}
			else if(n < rn)
				System.out.println("�� ����");
			else
				System.out.println("�� ����");
		}
	}

}