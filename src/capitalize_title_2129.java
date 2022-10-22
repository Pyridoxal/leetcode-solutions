/**
 You are given a string title consisting of one or more words separated by a single space, where each word consists of
 English letters. Capitalize the string by changing the capitalization of each word such that:
 If the length of the word is 1 or 2 letters, change all letters to lowercase.
 Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
 Return the capitalized title.
 ------------------------------------------------------------------------------------------------------------------------
 Solution converts string to all lowercase and then stores within a character array.
 Then, it iterates over the characters looking for the end of the first word; when a space is found, it then determines
 if the length of the word is more than 2 characters. If true, the first character of the word is capitalized.
 *
 */

public class capitalize_title_2129 {

    public static String capitalizeTitle(String title) {

        String lowerTitle = title.toLowerCase();
        char[] letter = lowerTitle.toCharArray();
        int len = letter.length;

        for(int i = 0; i < len; ++i) {
            int index = i;

            while((i < len) && (letter[i] != ' ')) {
                ++i;
            }
            if(i - index > 2) {
                letter[index] = Character.toUpperCase(letter[index]);
            }
        }

        System.out.println(letter);
        return String.valueOf(letter);
    }


}