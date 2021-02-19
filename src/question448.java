import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question448 {
    public static void main(String[] args) {
        int[] a = {1,1};
        findDisappearedNumbers(a);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        if (nums.length == 0){
            return result;
        }
        if (nums[0] != 1){
            for (int j=1; j<nums[0]; j++){
                result.add(j);
            }
        }
        for (int i=0; i<nums.length-1; i++){
            if ((nums[i+1]-nums[i]!=0) && (nums[i+1]-nums[i]!=1)){
                for (int j=nums[i]+1; j<nums[i+1]; j++){
                    result.add(j);
                }
            }
        }
        if (nums[nums.length-1] < nums.length){
            for (int i=nums[nums.length-1]+1; i<=nums.length; i++){
                result.add(i);
            }
        }
        return result;
    }
}
