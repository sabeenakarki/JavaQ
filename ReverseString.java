
public class ReverseString {
	public static void main(String[] args) {
		
		String str = "hello";
		char[] array = str.toCharArray();
		for(int i = array.length -1; i >= 0;i--) {
			System.out.print(array[i]);
		}
		
	}

}
