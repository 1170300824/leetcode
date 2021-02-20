import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class question1004 {
    public static void main(String[] args) {
        int[] A = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(A,3));
    }

    public static int longestOnes(int[] A, int K) {
        return 0;
    }

//    public static int longestOnes(int[] A, int K) {
//        if (K >= A.length){
//            return K;
//        }
//        List<Integer> temp = new ArrayList<>();
//        int count = 0;
//        for (int i=0; i<A.length; i++){
//            if (i == A.length-1){
//                if (A[i] == 0){
//                    count--;
//                }else {
//                    count++;
//                }
//                temp.add(count);
//                break;
//            }
//            if (A[i]==0){
//                count -= 1;
//                if(A[i+1]==1) {
//                    temp.add(count);
//                    count = 0;
//                }
//            }else {
//                count += 1;
//                if(A[i+1]==0) {
//                    temp.add(count);
//                    count = 0;
//                }
//            }
//        }
//        int begin = 1;
//        if (A[0] > 0){
//            begin = 0;
//        }
//        int pointer = begin;
//        int max = 0;
//        int sum1 = 0;
//        int sum2 = 0;
//        while(pointer < temp.size()){
//            if (temp.get(pointer)<0){
//                sum1 += temp.get(pointer);
//            }else {
//                sum2 += temp.get(pointer);
//            }
//            pointer++;
//            if (sum1+K<0 || pointer==temp.size()){
//                if (max < sum2+K){
//                    max=sum2+K;
//                }
//                while (sum1+K<0){
//                    sum1 -= temp.get(begin+1);
//                    sum2 -= temp.get(begin);
//                    begin += 2;
//                }
//            }
//
//        }
//        return max;
//    }
}
