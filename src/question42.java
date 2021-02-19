public class question42 {
    public static void main(String[] args) {
        int[] height = {};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if (height.length == 0){
            return 0;
        }
        int result = 0;
        int pointer1 = 0;
        int max = Integer.MIN_VALUE;
        int max_pointer = 0;
        for (int i=0; i<height.length; i++){
            if (max < height[i]){
                max = height[i];
                max_pointer = i;
            }
        }
        int sum = 0;
        for (int i=0; i<=max_pointer; i++){
            sum += height[i];
            if (height[pointer1] == 0){
                pointer1 = i;
            }else if (height[i] >= height[pointer1]){
                result += (i-pointer1)*height[pointer1] - sum + height[i];
                pointer1 = i;
                sum = height[i];
            }
        }

        pointer1 = height.length-1;
        sum = 0;
        for (int i=height.length-1; i>=max_pointer; i--){
            sum += height[i];
            if (height[pointer1] == 0){
                pointer1 = i;
            }else if ((height[i] >= height[pointer1])){
                result += (pointer1-i)*height[pointer1] - sum + height[i];
                pointer1 = i;
                sum = height[i];
            }
        }
        return result;
    }
}
