package demo;

public class MyCalculator {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int diff(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		System.out.println("Om Sum is : "+ calc.sum(20, 10));
		System.out.println("Om Diff is : "+ calc.diff(20, 10));

	}

}
