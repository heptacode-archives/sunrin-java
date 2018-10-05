import java.util.Random;

public class ArrayEx5 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int arr[][] = {{10,11,12},{20,21,},{30,31,32},{40,41,}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
