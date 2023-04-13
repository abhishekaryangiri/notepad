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
        int result = 0;
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