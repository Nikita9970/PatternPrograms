package Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int totalRow=5;
		
		for(int i=1;i<=totalRow;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			
			}
			for(int k=1;k<=totalRow-i;k++) {
				
				System.out.print(" ");
			}System.out.println();
			
		} 
		
		
		
	}

}
