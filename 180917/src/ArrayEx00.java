
public class ArrayEx00 {

	public static void main(String[] args) {
		//�迭 ���� : ��ȣ �ȿ� ���ڸ� ������ �ȵ�.
		int var1[];
		int []var2; // int[] var2;
		// �迭 ����
		var1 = new int[3];
		var2 = new int[] { 1, 2, 3 };
		// �迭 ���ҿ� ���� �Ҵ�
		var1[0] = 1;
		// for-each
		for(int i : var1)
			System.out.println(i);
		
	}

}
