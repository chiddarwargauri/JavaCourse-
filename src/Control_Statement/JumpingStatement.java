package Control_Statement;

public class JumpingStatement {

	public static void main(String args[]) {
		
		/*for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);//output 1,2,3,4
		}*/
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);//continue with the rest of the value ***output is 1,2,3,4,6,7,8,9,10
		}
	}
}
