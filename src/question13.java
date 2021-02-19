import java.util.HashMap;
import java.util.Map;

public class question13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        Map<String,Integer> roman = new HashMap<String,Integer>();
        roman.put("I",1);
        roman.put("IV",4);
        roman.put("V",5);
        roman.put("IX",9);
        roman.put("X",10);
        roman.put("XL",40);
        roman.put("L",50);
        roman.put("XC",90);
        roman.put("C",100);
        roman.put("CD",400);
        roman.put("D",500);
        roman.put("CM",900);
        roman.put("M",1000);
        for (int i=0; i<s.length();){
            int number1 = roman.get(String.valueOf(s.charAt(i)));
            int number2 = 0;
            if (i == s.length()-1){
                number2 = Integer.MIN_VALUE;
            }else{
                number2 = roman.get(String.valueOf(s.charAt(i+1)));
            }
            if (number1 >= number2){
                result += roman.get(String.valueOf(s.charAt(i)));
                i++;
            }else{
                result += roman.get(s.substring(i,i+2));
                i += 2;
            }
        }
        return result;
    }
}
