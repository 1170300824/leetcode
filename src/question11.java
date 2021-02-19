public class question11 {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }

    public static int maxArea(int[] height) {
        //指针和实际结果
        int left_pointer = 0;
//        int left = 0;
        int right_pointer = height.length - 1;
//        int right = height.length - 1;
        int temp = 0;
        //最大的面积
        int max = Math.min(height[0],height[height.length - 1]) * (height.length - 1);
        for (int i=0; i<height.length; i++){

            if (right_pointer <= left_pointer){
                 break;
            }

            if (height[left_pointer] < height[right_pointer]){
                left_pointer++;
                temp = Math.min(height[left_pointer],height[right_pointer]) * (right_pointer - left_pointer);
                if (temp > max){
                    max = temp;
//                    left = left_pointer;
//                    right = right_pointer;
                }
            }else{
                right_pointer--;
                temp = Math.min(height[left_pointer],height[right_pointer]) * (right_pointer - left_pointer);
                if (temp > max){
                    max = temp;
//                    left = left_pointer;
//                    right = right_pointer;
                }
            }
        }
        return max;
    }
}
