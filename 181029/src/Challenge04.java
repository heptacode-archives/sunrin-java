import java.util.Scanner;

public class Challenge04 {

	public static void main(String[] args) {
		Number n = new Number();
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.print("���� �Է�[0�϶� �Է� ����]>> ");
			input = sc.nextInt();
			if(input==0)
				break;
			n.add(input);
		}
		System.out.println("�հ�: "+n.getSum());
		System.out.println("�ִ밪: "+n.getMax());

	}

}
