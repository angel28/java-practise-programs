
	import java.util.Scanner;
    public class demo {

	

		public static void main(String[] args) {

			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the string:");
			String s=scn.next();
			
     		char[] chars=s.toCharArray();
		    int length=chars.length;
			
			for(int i=0;i<length;i++)
			{
				
				for(int j=0;j<length;j++) 
				{
					
				if(i+j==length-1||i==j) 
					
					System.out.print(chars[j]);
				
				else
					
					System.out.print(" ");
				}
				System.out.println( );
			}
		}

	}

	

