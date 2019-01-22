import java.util.Arrays;

public class Anangram {
	
	public static void main(String[] args) {
		isAnagram("Listen","Silent");
		isAnagram("MARY","Army");
		isAnagram("Teacher","Cheater");
		isAnagram("Lisn","Silt");
	}

	public static void isAnagram(String s1, String s2){
	    char[] c1 = s1.toLowerCase().toCharArray();
	    char[] c2 = s2.toLowerCase().toCharArray();

	    Arrays.sort(c1);
	    Arrays.sort(c2);

	    if(Arrays.equals(c1, c2))
	        System.out.println("s1 is anagram of s2");
	    else
	        System.out.println("Strings are not anagram");
	}
}
