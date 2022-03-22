
public class Hw1_p1 {
	
	public static void find(int[] a, int x) {
		int count = 0;

		//for loop that iterates through the length of the array
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) { //if number in array at position i equals x
				count = 1; //then make count equal to 1
				System.out.println(x + " is in a[" + i + "]");
			}
		}
		//out of for loop
		if (count == 0) { //if count is 0 then print "does not exist"
			System.out.println(x + " does not exist");
		}
	}
	
	public static boolean isPrefix(String s1, String s2) {

		int count = 0;
		if( s1.length() >= s2.length()){
			System.out.println("s1 is larger than s2 and cannot be compared");
		} else {
			//nested for loop that compares each char in both lists one by one
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						count++; //add to the total count if match is found
					}
				}if (count == s1.length()) //break for loop when count equals s1 length
					break;
			}
		}
		return count == s1.length(); //boolean return count that is equal to s1 length
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {5, 3, 5, 6, 1, 2, 12, 5, 6, 1};
		
		find(a, 5);
		find(a, 10);
		System.out.println();
		
		String s1 = "abc";
		String s2 = "abcde";
		String s3 = "abdef";
		
		if (isPrefix(s1,s2)) {
			System.out.println(s1 + " is a prefix of " + s2);
		}
		else {
			System.out.println(s1 + " is not a prefix of " + s2);
		}
		
		if (isPrefix(s1,s3)) {
			System.out.println(s1 + " is a prefix of " + s3);
		}
		else {
			System.out.println(s1 + " is not a prefix of " + s3);
		}
	}
}
