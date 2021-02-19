package huawei;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.nextLine();
            System.out.println(reout(input));

        }
    }

    public static String reout(String input) {
        boolean[] temp = new boolean[52];
        String result = "";
        for (char a : input.toCharArray()) {
            if (((a >= 'a' && a <= 'z') && (!temp[a - 'a']))) {
                temp[a - 'a'] = true;
                result += a;
            }else if ((a >= 'A' && a <= 'Z') && (!temp[26 + a - 'A'])){
                temp[26 + a - 'A'] = true;
                result += a;
            }
        }
        return result;
    }
}
