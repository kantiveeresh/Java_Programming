package day3;

public class IncrementalOperator {

	public static void main(String[] args) {
		
		//++ is called increment operator
		/*int a=10;
		System.out.println(a); //10
		
		
		a++;		//a=10+1;
		System.out.println(a); //11 */
		
		//case2 - post increment
		/*int a=10;
		
		int res=a++;
		System.out.println(res); //10
		
		System.out.println(a);  //11
		*/
		
		//case3 - pre increment
		int a=10;
		int res=++a;
		System.out.println(res); //11
		System.out.println(a);   //11
		
		
		

	}

}
