public class question485 {
    public static void main(String[] args) {

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int i:nums){
            sum += i;
            if (i == 0){
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        return Math.max(max, sum);
    }
}
