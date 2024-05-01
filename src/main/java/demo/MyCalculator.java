package demo;

public class MyCalculator {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int diff(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}

	static void  showMsg() {
		System.out.println("PollSCM is added ");
	}
	
	static void  show() {
		System.out.println("DEMO Jenkins File is added ");
	}
	
	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		System.out.println("Om Sum is : "+ calc.sum(20, 10));
		System.out.println("Om Diff is : "+ calc.diff(20, 10));
		System.out.println("Om mul is : "+ calc.mul(20, 10));
		System.out.println("Om div is : "+ calc.div(20, 10));
		showMsg();
		calc.show();

	}

}
