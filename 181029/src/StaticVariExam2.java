class Sunrin {
	static String school = "선린인터넷고";
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
		lee.setName("이정래"); lee.setClassRoom(4);
		kim.setName("김재인"); kim.setClassRoom(5);
		noh.setName("노연정"); noh.setClassRoom(6);
		System.out.println(lee.getName()+"은 "
		              +Sunrin.school+" 학생입니다.");
		System.out.println("학교번호는 "+Sunrin.SUNRIN_NUM+
				"이며, "+lee.getClassRoom()+"반입니다.");
	}
}
