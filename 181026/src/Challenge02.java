
public class Challenge02 {

	public static void main(String[] args) {
		int sum=0, odd=0, even=0;
		System.out.print("�迭�� ũ�� �Է�: ");
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("#�迭�� ������ ���#");
		int arr[] = new int[n]; // ���� ũ�� ��ŭ�� ������ 1���� �迭�� ����
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]+" ");
			if(arr[i] % 2 == 0)
				even++;
			else
				odd++;
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.println(even+" "+odd+" "+sum);
		
	}

}
