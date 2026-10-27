import java.util.HashMap;
import java.util.Map;

class RomanInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for(int i = 0; i < s.length() - 1; i++){
            int currentVal = map.get(s.charAt(i));
            int nextVal = map.get(s.charAt(i + 1));

            if (currentVal < nextVal){
                total -= currentVal;
            }
            else{
                total += currentVal;
            }
        }

        total += map.get(s.charAt(s.length() - 1));

        return total;
    }

    public static void main(String[] args) {

        RomanInteger converter = new RomanInteger();
        
        System.out.println("III = " + converter.romanToInt("III"));     
        System.out.println("LVIII = " + converter.romanToInt("LVIII"));   
        System.out.println("MCMXCIV = " + converter.romanToInt("MCMXCIV")); 
    }
}