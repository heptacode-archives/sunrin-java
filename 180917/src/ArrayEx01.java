
public class ArrayEx01 {

	public static void main(String[] args) {
		/*int [][]scores1;
		int []scores2[];
		int scores3[][];
		
		scores1 = new int[][] {{1,2,3},{4,5,6}};
		
		for(int i = 0; i < scores1.length; i++) {
			for(int j = 0; j < scores1[i].length; j++)
				System.out.print(scores1[i][j]+" ");
			System.out.println();
		}*/
		
		int scores[][];
		scores = new int[2][]; // 2�� �迭��ü�� �� ���� ��ü�� ����.
		
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {4,5,6,7};

		for(int i = 0; i < scores1.length; i++) {
			for(int j = 0; j < scores1[i].length; j++)
				System.out.print(scores1[i][j]+" ");
			System.out.println();
		}
		
		/*System.out.println("scores���� ����: "+scores.length);
		System.out.println("scores[0]�� ���� ����: "+scores[0].length);
		System.out.println("scores[1]�� ���� ����: "+scores[1].length);*/
	}

}
