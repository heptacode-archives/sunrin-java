class Student {
	public String name; // ��ü����, �ν��Ͻ�����
	public static int count = 0; // ���� ����, Ŭ���� ����, static����
	public void counting() {  // (�ν��Ͻ�)�޼ҵ�
		count++;
	}
}
public class StaticVariExam1 {
	public static void main(String[] args) {
		Student deunsol = new Student();
		Student donghyun = new Student();
		Student hongrim = new Student();
		System.out.printf("�ʱ�: "+Student.count+"\n");
		
		deunsol.counting();
		System.out.println("deunsol ī������ : "+Student.count);
		donghyun.counting();
		System.out.println("donghyun ī������: "+ Student.count);
		hongrim.counting();
		System.out.println("ȫ�� ī������ : "+Student.count);
	}
}
