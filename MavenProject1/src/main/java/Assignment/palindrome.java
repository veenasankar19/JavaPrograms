package Assignment;

public class palindrome {
	 public static boolean isPalindrome(String word) {
	        int i = 0;
	        int j = word.length() - 1;

	        while (i < j) {
	            if (word.charAt(i) != word.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String word1 = "java";                                                                        // Not a palindrome
	        String word2 = "malayalam";                                                                   // Is a palindrome 

	        if (isPalindrome(word1)) {                                                                    // Check word1
	            System.out.println(word1 + " is a palindrome.");
	        } else {
	            System.out.println(word1 + " is not a palindrome.");
	        }

	       
	        if (isPalindrome(word2)) {                                                                    // Check word2
	            System.out.println(word2 + " is a palindrome.");
	        } else {
	            System.out.println(word2 + " is not a palindrome.");
	        }
	    }
}
