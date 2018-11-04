class Student {
	public String name; // 객체변수, 인스턴스변수
	public static int count = 0; // 정적 변수, 클래스 변수, static변수
	public void counting() {  // (인스턴스)메소드
		count++;
	}
}
public class StaticVariExam1 {
	public static void main(String[] args) {
		Student deunsol = new Student();
		Student donghyun = new Student();
		Student hongrim = new Student();
		System.out.printf("초기: "+Student.count+"\n");
		
		deunsol.counting();
		System.out.println("deunsol 카운팅후 : "+Student.count);
		donghyun.counting();
		System.out.println("donghyun 카운팅후: "+ Student.count);
		hongrim.counting();
		System.out.println("홍림 카운팅후 : "+Student.count);
	}
}
