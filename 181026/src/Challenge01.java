
public class Challenge01 {

	public static void main(String[] args) {
		System.out.print("배열의 크기 입력: ");
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("#배열의 데이터 출력#");
		int arr[] = new int[n]; // 변수 크기 만큼의 길이의 1차원 배열을 생성
		for(int i = 0; i < n; i++)
			arr[i] = (i + 1) * 6;
		for(int i = 0; i < n; i++)
			System.out.println("arr["+i+"]="+arr[i]);
		
	}

}
