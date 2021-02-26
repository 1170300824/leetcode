public class question832 {
    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[0].length/2; j++){
                int temp = A[i][j];
                if (A[i][A[0].length-j-1] == 0){
                    A[i][j] = 1;
                }else {
                    A[i][j] = 0;
                }
                if (temp == 0){
                    A[i][A[0].length-j-1] = 1;
                }else {
                    A[i][A[0].length-j-1] = 0;
                }
            }
            if (A[0].length%2 == 1){
                if (A[i][A[0].length/2] == 0){
                    A[i][A[0].length/2] = 1;
                }else {
                    A[i][A[0].length/2] = 0;
                }
            }
        }

        return A;
    }
}
