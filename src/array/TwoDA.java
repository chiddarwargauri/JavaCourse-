package array;


/*1) declear an array 
 * 2) insert values into array
 * 3) find size of an array 
 * 4) read values from an array
 * */
public class TwoDA {

	public static void main(String[] args) {
		//int a[][]=new int[3][3];//int [][]a=new int[][]:int []a[]=new int[][];
		/*
	    a[0][0]=100
		a[0][1]=200
	
		a[1][0]=400
		a[1][1]=500
		
		a[2][0]=700
		a[2][1]=800
		*/
		
		int a[][]= {{100,200},{400,500},{700,800}};
		System.out.println("number of rows:"+a.length);
		System.out.println("number of column:"+a[0].length);
		
		for(int i=0;i<a.length;i++)//i represent row index
		{
			for(int j=0;j<a[i].length;j++)//j column index
			{
				
				System.out.println(a[i][j]+" "); //2 0 =700 2 1= 800
			}
			System.out.println();
			
		}
		
		//ENhance for loop
		
		/*for (int r[]:a)
		{
			for (int i:r)
			{
				System.out.print(i+"");
				
			}
			System.out.println();
			
		}*/
		
	}

}
