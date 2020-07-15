package interview;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCD";
		String a = "Hello World";
		reverseString(s);
		reverseString(a);
		
	}
	public static String reverseString(String a) {
		String r ="";
		for (int i = a.length()-1; i >= 0 ; i--) {
			r += a.charAt(i);
		}
		System.out.println(r);
		return r;
	}
}
