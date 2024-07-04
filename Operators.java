package day3;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic operators + - * / %
		
		
		int a=20, b=10;
		/*
		int resu=a + b;
		System.out.println("Sum of a and b is: " + resu);
		System.out.println("Sum of a and b is: " + (a+b));
		
		System.out.println("Diff of a and b is: " + (a-b));
		System.out.println("Multiplication of a and b is: " + (a*b));
		System.out.println("Division of a and b is: " + (a/b));
		System.out.println("Madulo Division a and b is: " + (a%b));
		*/
		
		//Relational/Comparison operators >, >=, <, <=, !=, == 
		//Returns boolean value True or False
		/*
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		System.out.println(a == b);
		
		boolean rs=a>b;
		System.out.println(rs); */
		
		//Logical operators &&, ||, !
		//returns boolean values true or false
		//works with two boolean values
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1); //false
		
		boolean b2=10<20;
		System.out.println(b2); //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		
		System.out.println((10<20) && (20>10)); //true
		
		
		
		
		
		
		
	}

}
