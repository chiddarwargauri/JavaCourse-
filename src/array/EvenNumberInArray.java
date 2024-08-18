package array;

public class EvenNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,2,4,6,8,10};
		boolean flag= false;
		for(int i:a){
			if(i%2==0) {
				flag=true;
				System.out.println(i);
			}
		}
		if(flag==false) {
			System.out.println("even number is not present in a array");
		}
		

	}

}
