
public class CountLetter {
	public static void main(String[] args) {
		String str = "ababbbcccddaaj";
		int count = 1;
		char temp = 1;
		char val;
		
		
		char[] array = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			val =array[i];
			if (temp == val) {
				count+=1;
			}
			 
				//if(str.charAt(i) == str.charAt(i+1))
					System.out.println());
			
			
		}
	}

}
