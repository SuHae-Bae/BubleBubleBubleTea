import java.util.Scanner;

public class OrderBubleTea {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("원하는 옵션을 선택하세요.");
		System.out.println("---------------------");
		System.out.println("1.펄 2배: +500원");
		System.out.println("2.얼음 less: 300원");
		System.out.println("3.펄 2배 +얼음 less: +800원");
		System.out.println("4.추가옵션 없음");
		System.out.println("---------------------");
		
		System.out.print("옵션 선택: ");
		n = sc.nextInt();
		
		BubleTea b = new BubleTea(n);
		
		if(n == 1) {
			b.option1();
		}
		
		if(n == 2) {
			b.option2();
		}
		
		if(n == 3) {
			b.option3();
		}
		
		if(n == 4) {
			b.option4();
		}
		
		System.out.println("이용해 주셔서 감사합니다");
	}
}	
