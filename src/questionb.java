import java.util.Scanner;

public class questionb {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s == null){
            System.out.println("不空");
        }else {
            System.out.println("空");
        }
//        String s = in.nextLine();
//        String p = "";
//        if (in.hasNext()){
//            p = in.nextLine();
//        }
//        if (s.equals(p)){
//            System.out.println(0);
//        }
//        int count = 0;
//        while (!s.equals(p)){
//            int begin = -1;
//            boolean flag = true;
//            for (int i=0; i<s.length()-3; i++){
//                if (s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)){
//                    begin = i;
//                    flag = false;
//                    break;
//                }
//            }
//
//            if (flag){
//                break;
//            }
//            if (begin != -1){
//                s=s.substring(0,begin)+s.substring(begin+3);
//                count++;
//            }
//        }
//
//        if (s.equals(p)){
//            System.out.println(count);
//        }else {
//            System.out.println(-1);
//        }
    }
}
