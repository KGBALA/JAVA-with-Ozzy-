public class PalindromeMethod {
	public static void main(String[] args) {

		checkPalindrome("mom");
		checkPalindrome("anna");
		checkPalindrome("eddie");
		checkPalindrome("aziza");
	}

	public static void checkPalindrome(String s) {

		// reverse the given String
		String reverse = new StringBuffer(s).reverse().toString();

		// check whether the string is palindrome or not
		if (s.equals(reverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}