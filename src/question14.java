public class question14 {
    public static void main(String[] args) {
        String[] strs = {};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int min_length = Integer.MAX_VALUE;
        if (strs.length == 0){
            return "";
        }
        for (int i=0; i<strs.length; i++){
            if (strs[i].length() < min_length){
                min_length = strs[i].length();
            }
        }

        for (int i=0; i<min_length; i++){
            for (int j=0; j<strs.length; j++){
                if (strs[0].charAt(i) != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0].substring(0,min_length);
    }

}
