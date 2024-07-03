package day2;

public class DataTypes {

	public static void main(String[] args) 	{
		
		//Numeric data types
		
		int a=100, b=200;
		System.out.println("The value of a is: " +a);
		System.out.println("The value of b is: " +b);
		System.out.println(a+b);
		
		System.out.println("the sum of a and b is: " + (a+b));
		
		byte by=125;
		System.out.println(by);
		
		short she=3535;
		System.out.println(she);
		
		long l=123456789L;			//Literal is needed L/ l
		System.out.println(l);
		
		//Decimal numbers - first, double
		
		float item_price=15.5F; 	//Literal is needed F/f
		System.out.println(item_price);
		
		double dol=1234.4343412;
		System.out.println(dol);
		
		//char ch = 'ABC';		//Invalid
		//String ch = 'ABC':	//Invalid
		//String ch = 'A';		//Invalid
		//String ch = "A";		//Valid
		
		boolean be = false;	//allows only true/false
		System.out.println(be);
		
		//boolean bl = "true"	//not Valid
		//boolean bl = "false"	//not Valid
		
		//String bl = true		//not Valid
		String bl = "true";	//Valid
		System.out.println(bl);
		
	}

}
