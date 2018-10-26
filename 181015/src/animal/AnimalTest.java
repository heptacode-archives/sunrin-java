package animal;

class Util {
	public static int thisYear = 2018;
	public static int getAge(int birthyear) {
		return thisYear - birthyear;
	}
}
class Animal {
	private String group = "동물";
	void setGroup(String group) { // setter 메소드
		this.group = group;
	}
	String getGroup() { // getter 메소드
		return group;
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal wangNim = new Animal();
		wangNim.setGroup("사람");
		System.out.println("wangNim의 나이: "+Util.getAge(1959));
		// wangNim.group = "동물";
		System.out.println("wangNim은 "+wangNim.getGroup());
	}
}
