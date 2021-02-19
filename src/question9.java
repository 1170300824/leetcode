public class question9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234));
    }

    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        String x_string = String.valueOf(Math.abs(x));
        if(x_string.length() % 2 == 0){
            for(int i=0; i<(x_string.length()/2); i++){
                if(x_string.charAt(i) != x_string.charAt(x_string.length() - i - 1)){
                    return false;
                }
            }
        }else{
            for(int i=0; i<=(x_string.length()/2); i++){
                if(x_string.charAt(i) != x_string.charAt(x_string.length() - i - 1)){
                    return false;
                }
            }
        }
        return true;
    }
}
