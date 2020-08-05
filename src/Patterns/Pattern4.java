
package Patterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int totalRow=5;
		
		for(int i=1;i<=totalRow;i++) {
			
			for(int j=1;j<=totalRow-i;j++) {
				
				System.out.print(" ");
				
			}
				
				for(int j=1;j<=i;j++) {
					
					System.out.print("*");
					
				
				}System.out.println();
				
	} 
for(int i=1;i<=totalRow;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
				
			}
				
				for(int j=1;j<totalRow-i+1;j++) {
					
					System.out.print("*");
					
				
				}System.out.println();
		
		
		
	} 


}
}

