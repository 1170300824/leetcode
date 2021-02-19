import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class question76 {
    public static void main(String[] args) {

    }

    public static String minWindow(String s, String t) {
        Set<Character> count_t = new HashSet<>();
        Set<Character> count_s = new HashSet<>();
        for (int i=0; i<t.length(); i++){
            count_t.add(t.charAt(i));
//            char temp = t.charAt(i);
//            if ((temp <= 'z') && (temp >= 'a')){
//                count_t.add(temp - 'a');
//            }else if ((temp <= 'Z') && (temp >= 'A')){
//                count_t.add(temp - 'A');
//            }
        }



        return "";
    }

}
