
public class CountLetter {
	public static void main(String[] args) {
		String str = "ababbbcccddaaj";
		int count = 1 ;
		String temp = "";
		String output= "";
		
		
		
		char[] array = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			
			
			
			String CurrentString = String.valueOf(array[i]);
			
			if(temp.equals(CurrentString)) {
				count++;
				StringBuffer sb = new StringBuffer(output);
				sb.deleteCharAt(sb.length() - 1);
				output = String.valueOf(sb);
				output +=  String.valueOf(count);	
				
			}
			else {
				count = 1;
				output += CurrentString + String.valueOf(count);	
				
				
			}
			temp = CurrentString;
			
					
			
			
		}
		System.out.print(output);
	}

}
