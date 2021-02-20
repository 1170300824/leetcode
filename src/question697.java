import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class question697 {
    public static void main(String[] args) {

    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> count_map = new HashMap<>();
        for (int i:nums){
            if (count_map.containsKey(i)){
                count_map.put(i,count_map.get(i)+1);
            }else {
                count_map.put(i,1);
            }
        }

        int max = 0;
        for (int temp:count_map.keySet()){
            if (count_map.get(temp) > max){
                max = count_map.get(temp);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int temp:count_map.keySet()){
            if (count_map.get(temp) == max){
                set.add(max);
            }
        }
        return 0;
    }
}
