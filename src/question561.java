import java.util.Arrays;

public class question561 {

    public static void main(String[] args) {

    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int length = nums.length;
        for (int i=0; i<length; i+=2){
            result += nums[i];
        }
        return result;
    }

}
