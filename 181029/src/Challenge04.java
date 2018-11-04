import java.util.Scanner;

public class Challenge04 {

	public static void main(String[] args) {
		Number n = new Number();
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.print("정수 입력[0일때 입력 종료]>> ");
			input = sc.nextInt();
			if(input==0)
				break;
			n.add(input);
		}
		System.out.println("합계: "+n.getSum());
		System.out.println("최대값: "+n.getMax());

	}

}
