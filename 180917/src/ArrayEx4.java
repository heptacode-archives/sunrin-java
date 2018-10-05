import java.util.Random;

public class ArrayEx4 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int arr[][] = new int[3][4];
		int sum = 0;
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 4; j++) {
				arr[i][j] = rd.nextInt(10);
			}
		

		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
				sum += arr[i][j];
			}
			System.out.println();
		}
		
		System.out.println("гу╟Х: "+sum);
	}

}
