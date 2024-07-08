package day3;

public class ConditionalTernaryOperator {

	public static void main(String[] args) {
		
		//var=exp ? result 1 : result 2;
		
		//ex1
		/*
		int a=200, b=100;
		
		int x= (a>b)? a : b;		
		System.out.println(x);
		*/
		
		//ex2
		/*
		int x = (1==1)? 100: 200;
		System.out.println(x);
		
		int y = (1==2)? 100: 200;
		System.out.println(y);*/
		
		int person_age=25;
		String res=(person_age>18)? "Eligible": "Not Eligible";
		System.out.println(res);
		
		int age=18;
		String resul=(age>18)? "Eligible": "Not Eligible";
		System.out.println(resul);

	}

}
