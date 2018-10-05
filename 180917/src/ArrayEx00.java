
public class ArrayEx00 {

	public static void main(String[] args) {
		//배열 선언 : 괄호 안에 숫자를 넣으면 안됨.
		int var1[];
		int []var2; // int[] var2;
		// 배열 생성
		var1 = new int[3];
		var2 = new int[] { 1, 2, 3 };
		// 배열 원소에 값을 할당
		var1[0] = 1;
		// for-each
		for(int i : var1)
			System.out.println(i);
		
	}

}
