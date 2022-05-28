import java.util.Scanner;

public class dematicCode {
	
	

	

	public static void main(String[] args) {
		
		
		int result = sum(10);
		System.out.println(result);
	
		
	}
	
	static int sum(int k ) {
		
		
		if(k>0) {
			return k +sum(k-1);
			
		}
		else {
			return 0;
		}
	}
	
	
	
	
}

		// TODO Auto-generated method stub
		
	

