package animal;

class Util {
	public static int thisYear = 2018;
	public static int getAge(int birthyear) {
		return thisYear - birthyear;
	}
}
class Animal {
	private String group = "����";
	void setGroup(String group) { // setter �޼ҵ�
		this.group = group;
	}
	String getGroup() { // getter �޼ҵ�
		return group;
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal wangNim = new Animal();
		wangNim.setGroup("���");
		System.out.println("wangNim�� ����: "+Util.getAge(1959));
		// wangNim.group = "����";
		System.out.println("wangNim�� "+wangNim.getGroup());
	}
}
