package array;

public class Array {
	
	public static void main(String args[])
	{ /*
	  **static array
	
	//declaration 
		 int a[]=new int[5];
		 
		//insert values into array
			 
			 a[0]=100;
			 a[1]=200;
			 a[2]=300;
			 a[3]=400;
			 a[4]=500;*/
		
		//dynamic array
		//declear array
		int a[]= {100,200,300,400,500};
		
		System.out.println(a.length);//size of the array

	    System.out.println(a[2]);//read value
	    
	    //classic for loop for read multiple values
	    /*for(int i=0;i<=a.length-1;i++) {
	    	System.out.println(a[i]);
	    }*/
	    //for each loop second approch/enhance for loop
	    
	    for (int i:a) {
	    	System.out.println(i);
	    }
	    
	    
	}
}
