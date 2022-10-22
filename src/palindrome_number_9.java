public class palindrome_number_9 {

    /**
     * Given an integer x, return true if x is palindrome integer.
     *
     * An integer is a palindrome when it reads the same backward as forward.
     *
     * For example, 121 is a palindrome while 123 is not.
     *
     * Solution casts the int parameter to string, creates a StringBuilder object to reverse the string, and compares
     * the forward and backward string objects.
     *
     */

    public boolean isPalindrome(int x) {

        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder(str);
        String revString = String.valueOf(sb.reverse());

        if (str.equals(revString)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {

    }
}
