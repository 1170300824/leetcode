import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third = n - 1;
            int target = -nums[first];
            // 枚举 b
            for (int second = first + 1; second < n; ++second) {
                // 需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length >= 3){
            Arrays.sort(nums);
            for (int i=0; i<nums.length-2; i++){
                int pointer1 = i+1;
                int pointer2 = nums.length - 1;
                boolean flag = true;
                if ((i>0) && (nums[i] == nums[i-1])){
                    continue;
                }
                while(pointer1 < pointer2){
                    if (nums[i] + nums[pointer1] + nums[pointer2] < 0){
                        if (nums[pointer1] == nums[pointer1 + 1]){
                            pointer1++;
                            flag = false;
                        }else {
                            flag = true;
                            pointer1++;
                        }
                    }else if (nums[i] + nums[pointer1] + nums[pointer2] > 0){
                        if (nums[pointer2] == nums[pointer2 - 1]){
                            pointer2--;
                            flag = false;
                        }else{
                            flag = true;
                            pointer2--;
                        }
                    }else{
                        if (flag){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[pointer1]);
                            temp.add(nums[pointer2]);
                            result.add(temp);
                        }
                        pointer1++;
                        if (nums[pointer1] == nums[pointer1-1]){
                            flag = false;
                        }
                    }
                }
            }
        }
        return result;
    }
}
