package Patterns;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int row=5;
			for(int i=1;i<row;i++) {
				
				for(int j=1;j<=row;j++) {
					if(i==1 || j==row) {
						
						System.out.print("*");
					}
					else {
						
						System.out.print(" ");
					}
					
				}System.out.print(" ");

					
								
				}
		
	}

}
