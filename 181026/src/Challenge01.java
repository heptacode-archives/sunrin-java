
public class Challenge01 {

	public static void main(String[] args) {
		System.out.print("�迭�� ũ�� �Է�: ");
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("#�迭�� ������ ���#");
		int arr[] = new int[n]; // ���� ũ�� ��ŭ�� ������ 1���� �迭�� ����
		for(int i = 0; i < n; i++)
			arr[i] = (i + 1) * 6;
		for(int i = 0; i < n; i++)
			System.out.println("arr["+i+"]="+arr[i]);
		
	}

}
