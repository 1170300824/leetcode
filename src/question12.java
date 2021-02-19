import java.util.HashMap;
import java.util.Map;

public class question12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(19940));
    }

    public static String intToRoman(int num) {
        String result = new String();
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0; i<13; i++){
            if (num>=values[i]){
                int a = num/values[i];
                num = num%values[i];
//                System.out.println(a);
//                System.out.println(num);
                for (int j=0; j<a; j++){
                    result += reps[i];
                }
            }
        }
        return result;
    }
}
