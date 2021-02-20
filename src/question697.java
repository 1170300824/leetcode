import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class question697 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums));
    }

    public static int findShortestSubArray(int[] nums) {
        if (nums.length==0){
            return 0;
        }
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
                set.add(temp);
            }
        }

        int result = nums.length;
        for (int i:set){
            int pointer1 = 0;
            int pointer2 = nums.length-1;
            while (nums[pointer1] != i){
                pointer1++;
            }
            while (nums[pointer2] != i){
                pointer2--;
            }
            if (pointer2-pointer1+1<result){
                result = pointer2-pointer1+1;
            }
        }
        return result;
    }
}
