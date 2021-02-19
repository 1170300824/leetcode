import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class question1124 {
    public static void main(String[] args) {
        int[] hours = {9,9,6,0,6,6,9};
        System.out.println(longestWPI(hours));
    }

    public static int longestWPI(int[] hours) {
        int sum = 0;
        int res = 0;
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        for(int i = 0; i < hours.length; i++){
            int temp = hours[i] > 8 ? 1 : -1;
            sum += temp;
            if(sum > 0)
                res = i + 1;
            else {
                if(!sumToIndex.containsKey(sum))
                    sumToIndex.put(sum, i);
                if(sumToIndex.containsKey(sum - 1))
                    res = Math.max(res, i - sumToIndex.get(sum - 1));
            }
        }
        return res;
    }
}
