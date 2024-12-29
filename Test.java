package day3;

public class Test {

	public static void main(String[] args) {
		
		//Using temporary variable
		
		/*
		int a=10, b=20;
		
		System.out.println("Before swapping: a ="+ a + ", b =" + b);
		
		int temp = a;
		a = b;
		b =temp;
		
		System.out.println("After swapping: a ="+ a + ", b =" + b);
		*/
		
		//Without Using a Temporary Variable
		//You can also swap the values without using a temporary variable by using arithmetic operations:
		/*
		int a=10, b=20;

		System.out.println("Before swapping: a ="+ a + ", b =" + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping: a ="+ a + ", b =" + b);
		*/
		
		int a = 10, b =20;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After swapping: a ="+ a +", b ="+b);
				
		

	}

}
