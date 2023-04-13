/* Write a function to check whether a given string is a palindrome without using any built-in
functions. (A palindrome is a word, phrase, number, or other sequence of characters which
reads the same backward or forward.) (4 points) */

package puresoftware;

public class prob1 {
    static boolean checkPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "madam";
        str = str.toLowerCase();
        if (checkPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }}