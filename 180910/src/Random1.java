import java.util.Random;
import java.util.Scanner;

public class Random1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int rn = rd.nextInt(100);
		System.out.println("### 숫자 맞추기 게임 ###\n0~99 자연수 중 하나를 입력하세요.");
		for(int i = 1; true; i++) {
			System.out.printf("%d번째 도전 >> ", i);
			int n = sc.nextInt();
			if(n == rn) {
				System.out.printf("%d번째에 시도에 성공하셨습니다!", i);
				break;
			}
			else if(n < rn)
				System.out.println("더 높게");
			else
				System.out.println("더 낮게");
		}
	}

}