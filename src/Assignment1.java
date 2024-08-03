/*
 *q.a} print hello 
		 GAURI
 
 *Q.B}ADDITION 36+4=40
 
 *Q.c}Swap two number

 * Q.d} swap without usig third variable
 */
public class Assignment1 {
	public static void main(String args[]) {
		
		
				
		//q.a}answer
		System.out.println("hello \n gauri");
		
		
		//q.b} answer
		
		int a=4;
		int b=36;
		System.out.println(a+b);
		
		//Q.c} answer
		
		int c=10;
		int d=20;
		int temp;
		
		temp=c;
		c=d;
		d=temp;
		System.out.println("c is"+c);
		System.out.println("d is"+d);
		
		
		//Q.d}
	
	    int e= 40;
	    int f=50;
	    
	    e=e+f;    // ---->	90;(now the value of is 90)
	    
	    f=e-f; //--------------->90-50=40; (now the value of f is 40)
	  e=e-f; //----------------------> 90-40=50; (now the value of e is 50)
	    
	    System.out.println("e is" +e);
	    System.out.println("f is"+f);
	
	}
	
	

}


