public class LetterCount {
	static String print="";
	
	static public void count(String name) {
		int x=1;
		boolean flag =true;
	
		
		for (int i = 0; i <name.length(); i++) {//////aabbbccccaaadddd=length16 
			
			if((i!=name.length()-1)) { //i=15  // flag =true
				
			if(flag==false) {//x=1
			x=1;
			}
			
			if(name.charAt(i)==name.charAt(i+1)) {
				x++;// x= 4
				flag=true;
				
				///this is for last condition when i =length
				if(i+1==name.length()-1) {
					print=print+name.charAt(i);
					print=print+x;
				}
				
			}
			else {
				
				print=print+name.charAt(i);// print=A2+b print =a2b
				print=print+x;/// print=a+2 print=a2 print= a2b3
				flag=false;     /// flag = false
				x=1;
			}
			
			
		}else {
			
			    
			 if(name.charAt(i)!=name.charAt(i-1)) {
				x=1;
				print=print+name.charAt(i);
				print=print+x;
			 }
			
		}
		}
		
	}

	public static void main(String[] args) {
	
    String array="aabbbccccaaadddd";
		
    count(array);
    
    System.out.println(print);
		
		
		
	}

	
	

		
	
}
	

	   
	    

	 