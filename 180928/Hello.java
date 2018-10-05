public class Hello {
	public static void main(String[] args){
		System.out.println("명령행 매개변수를 입력하세요");
		if(args.length == 1)
			System.out.println("입력된 명령행 매개변수는 "+args[0]+"입니다.");
		else if(args.length == 2)
			System.out.println("입력된 명령행 매개변수는 "+args[0]+", "+args[1]+"입니다.");
		else 
			System.out.println("매개변수 2개 이하로 입력해주세요.");
	}
}