import java.util.Scanner;

public class BubleTea {
	int money = 3500;
	
	public BubleTea(int n){
	}
	
	public void option1(){
		money += 500;
		System.out.println("가격: "+ money);
	}
	
	public void option2() {
		money += 300;
		System.out.println("가격: "+ money);
	}
	
	public void option3() {
		money += 800;
		System.out.println("가격: "+ money);
	}
	
	public void option4() {
		System.out.println("가격: "+ money);
	}
}
