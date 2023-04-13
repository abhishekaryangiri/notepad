/*
 Write a function that converts a Roman numeral to an integer. (ex: “I” = 1, “III” = 3, “IV” = 4,
“V” = 5, “VI” = 6, “X” = 10, “L” = 50, “LX” = 60, “XLIX” = 49, “C”= 100, “CIX” = 109, “CLX” =
160, “D” = 500, “M” = 1000, “CDXLIV” = 444, “MCMIV” = 1904, …). The input to the function
is a String and the output is an int. (5 points)
 */
package puresoftware;

import java.util.HashMap;
import java.util.Map;

class doit {
    int romanToInt(String b)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0 ;
        for (int i = 0; i < b.length(); i++) {
            if (i > 0
                && map.get(b.charAt(i))
                       > map.get(b.charAt(i - 1))) {
                result += map.get(b.charAt(i))
                          - 2 * map.get(b.charAt(i - 1));
            }
            else {
                result += map.get(b.charAt(i));
            }
        }
        return result;
    }
}
public class Prob4 {
 
    public static void main(String[] args)
    {
        String b;
        doit prob4 = new doit();
        System.out.println(prob4.romanToInt("XX"));
    
}}