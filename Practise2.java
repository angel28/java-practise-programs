public class Practise2 {
	
	public static void main(String[] args) {
		
		String arr="I love my mom";
		String ch[]=arr.split(" ");
		
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i].length()<ch[j].length()) {
					
					String temp=ch[i];
                    ch[i]=ch[j];
                   ch[j]=temp;

                    
				}

			}
			
		}
		
		 for (int i = 0; i < ch.length; i++) {
		     System.out.println(ch[i]);
			
	}

    }
	}
