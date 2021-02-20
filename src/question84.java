public class question84 {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3,2,2};
        question84 question = new question84();
        System.out.println(question.largestRectangleArea(heights));
    }

    public int largestRectangleArea(int[] heights) {
        int result = 0;
        for (int i=0; i<heights.length; i++){
            int min = heights[i];
            for (int j=i; j<heights.length; j++){
                if (heights[j] < min){
                    min = heights[j];
                }
                int sum = (j-i+1)*min;
                if (result < sum){
                    result = sum;
                }
            }
        }
        return result;
    }
}
