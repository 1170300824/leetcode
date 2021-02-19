import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class question1306 {
    public static void main(String[] args) {
        int[] arr = {4,2,3,0,3,1,2};
        System.out.println(canReach(arr,5));
    }

    public static boolean canReach(int[] arr, int start) {
        boolean[] flag = new boolean[arr.length];
        jump(start,arr,flag);
        Set<Integer> zero = new HashSet<Integer>();
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 0){
                zero.add(i);
            }
        }
        for (Integer a:zero){
            if (flag[a]){
                return true;
            }
        }
        return false;
    }

    public static void jump(int index,int[] arr,boolean[] flag){
        flag[index] = true;
        if ((index + arr[index] < arr.length) && (!flag[index + arr[index]])){
            flag[index + arr[index]] = true;
            jump(index + arr[index],arr,flag);
        }
        if ((index - arr[index] >= 0) && (!flag[index - arr[index]])){
            flag[index - arr[index]] = true;
            jump(index - arr[index],arr,flag);
        }
    }

}