public class detect_capital_520 {

    /**
     *
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     *
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     * Given a string word, return true if the usage of capitals in it is right.
     *
     * Solution compares word against a fully capitalized, lowercase, and first letter capitalized version of the
     * string.
     *
     */

    public static boolean isProperCapital(String word) {

        String upperCase = word.toUpperCase();
        String lowerCase = word.toLowerCase();

        String oneUpper = lowerCase.substring(0, 1).toUpperCase() + lowerCase.substring(1);

        if(word.equals(upperCase)) {
            return true;
        } else if (word.equals(lowerCase)) {
            return true;
        } else if (word.equals(oneUpper)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
