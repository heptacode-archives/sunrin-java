
public class Number {
	private int sum = 0;
	private int max = Integer.MIN_VALUE;
	
	public int getSum() {
		return sum;
	}
	
	public int getMax() {
		return max;
	}
	
	public void add(int input) {
		sum += input;
		max = max > input ? max : input;
	}
	
	
}
