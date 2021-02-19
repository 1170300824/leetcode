package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int size = scanner.nextInt();
            int[] input = new int[size];
            for (int i=0; i<input.length; i++){
                input[i] = i;
            }
            System.out.println(last(input));
        }
    }

    public static int last(int[] input){
        List<Integer> temp = new ArrayList<>();
        for (int i:input){
            temp.add(i);
        }
        int i = 2;
        while (temp.size() > 1){
            temp.remove(i);
            i = (i+2)%temp.size();
        }
        return temp.get(0);
    }

}
