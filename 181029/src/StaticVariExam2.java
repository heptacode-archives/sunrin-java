class Sunrin {
	static String school = "�������ͳݰ�";
	static final int SUNRIN_NUM = 11312;
	private String name;
	private int classRoom;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public String getName() {
		return name;
	}
	
	public int getClassRoom() {
		return classRoom;
	}
}

public class StaticVariExam2 {
	public static void main(String[] args) {
		Sunrin lee = new Sunrin();
		Sunrin kim = new Sunrin();
		Sunrin noh = new Sunrin();
		lee.setName("������"); lee.setClassRoom(4);
		kim.setName("������"); kim.setClassRoom(5);
		noh.setName("�뿬��"); noh.setClassRoom(6);
		System.out.println(lee.getName()+"�� "
		              +Sunrin.school+" �л��Դϴ�.");
		System.out.println("�б���ȣ�� "+Sunrin.SUNRIN_NUM+
				"�̸�, "+lee.getClassRoom()+"���Դϴ�.");
	}
}
