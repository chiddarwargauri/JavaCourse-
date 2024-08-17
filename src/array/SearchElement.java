package array;

public class SearchElement {

	public static void main(String[] args) {
		int a[]= {10,200,100};
		int num =100;
		boolean flag=false;
		for(int i:a) {
			//System.out.println(i)
			if(i==num)
			{
				System.out.println("element found");
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		{System.out.println("Element not found");}
		
		
	}

}
