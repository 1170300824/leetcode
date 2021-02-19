package tools;

import java.util.HashSet;
import java.util.Set;

public class question720 {

    public static void main(String[] args) {

    }

    public static String longestWord(String[] words) {
        int max = Integer.MIN_VALUE;
        Set<String> set = new HashSet<>();
        for (String temp:words){
            if (temp.length() > max){
                max = temp.length();
            }
        }

        for (String temp:words){
            if (temp.length() == max){
                set.add(temp);
            }
        }


        String min_string = null;
        int min_count = Integer.MAX_VALUE;
        for (String temp:set){
            int sum = 0;
            char[] a = temp.toCharArray();
            for (int b:a){
                sum = b + sum*10;
            }

            if (sum < min_count){
                min_count = sum;
                min_string = temp;
            }
        }
        return min_string;
    }

}
