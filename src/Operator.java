
public class Operator {
	public static void main(String args[]) {
		int a= 10;
		int b=20;
		
		//Arithmatic Operation  + -* / %
		
		System.out.println("sum of a and b is :-"+(a+b));
		System.out.println("difference between a and b is:-"+(a-b));
		System.out.println("multiplication of a and b is:-"+(a*b));
		System.out.println("division of a and b is:-"+(a/b));
		System.out.println("Mod div of a and b is :- "+(a%b));
		
		// Relational operator / Comparison operatior - always return a value(true/false)
		//> >= < <= != ==
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a!=b);
		
		//logical operation && || ! --return true/false
		
		boolean x=true;
		boolean y= false;
		
		System.out.println(x||y);
		System.out.println(x&&y);
		System.out.println(!x);
	
		
		//increment and decrement  operator 
            int increment=100;
            int decrement= 200;
             
		System.out.println(increment++);//post increment
		System.out.println(++increment);//pre increment
		System.out.println(decrement--);//post degrement 
		System.out.println(--decrement);//pre decrement 
		
	
		
		
		
	}

}
