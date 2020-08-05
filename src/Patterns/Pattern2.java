package Patterns;


public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int totalRow=5;
		
		for(int i=1;i<=totalRow;i++) {
			
			for(int j=1;j<=totalRow-i+1;j++) {
				
				System.out.print("*");
				
			
			}
			for(int k=1;k<=i-1;k++) {
				
				System.out.print(" ");
			}System.out.println();
			
		} 
		
		
	}

}
