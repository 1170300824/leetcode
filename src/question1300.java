import java.util.Arrays;

public class question1300 {
    public static void main(String[] args) {
        int[] arr = {4,9,3};
        System.out.println(findBestValue(arr,10));
    }

    public static int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int pre = Integer.MAX_VALUE;
        int result = 0;
        for (int i= target/arr.length; i<=arr[arr.length-1]; i++){
            int sum = 0;
            for (int m=0; m<arr.length; m++){
                if (arr[m] > i){
                    sum += i;
                }else {
                    sum += arr[m];
                }
            }
            if (Math.abs(sum - target) < pre){
                pre = Math.abs(sum - target);
                result = i;
            }else {
                break;
            }
        }
        return result;
    }
}
