public class Hello {
	public static void main(String[] args){
		System.out.println("����� �Ű������� �Է��ϼ���");
		if(args.length == 1)
			System.out.println("�Էµ� ����� �Ű������� "+args[0]+"�Դϴ�.");
		else if(args.length == 2)
			System.out.println("�Էµ� ����� �Ű������� "+args[0]+", "+args[1]+"�Դϴ�.");
		else 
			System.out.println("�Ű����� 2�� ���Ϸ� �Է����ּ���.");
	}
}