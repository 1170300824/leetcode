package huawei;

import java.util.Scanner;

public class huawei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            int n = Integer.parseInt(scanner.next());
            int m = Integer.parseInt(scanner.next());
            int[] temp = new int[n];
            for (int i=0; i<n; i++){
                temp[i] = scanner.nextInt();
            }
            for (int i=0; i<m; i++){
                String aaa = scanner.next();
                if (aaa.equals("Q")){
                    System.out.println(arrange_Q(temp,scanner.nextInt(),scanner.nextInt()));
                }else {
                    arrange_U(temp,scanner.nextInt(),scanner.nextInt());
                }
            }
        }while (scanner.hasNext());
    }

    public static int arrange_Q(int[] array,int number1,int number2){
        int result = Integer.MIN_VALUE;
        if (number1 > number2){
            int a = number1;
            number1 = number2;
            number2 = a;
        }
        for (int i=number1-1; i<number2; i++){
            if (array[i] > result){
                result = array[i];
            }
        }
        return result;
    }

    public static void arrange_U(int[] array,int number1,int number2){
        array[number1-1] = number2;
    }

}
