import java.util.*;

public class question {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        Set<usr> result = new HashSet<>();
        String[] name = new String[number];
        int[] valarray = new int[number];
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            usr temp = new usr();
            String aaa = in.next();
            name[count] =aaa;
            temp.name = aaa;
            temp.marry = in.next();
            temp.workage = in.nextInt();
            temp.score = in.nextInt();
            result.add(temp);
            count++;
            if (count == number){
                Arrays.sort(name);
                Iterator<usr> a = result.iterator();
                int count2 = 0;
                while (a.hasNext()) {
                    int sum = 0;
                    usr bbb = a.next();
                    sum += bbb.score*1000;
                    sum += bbb.workage*100;
                    if (bbb.marry.equals("married")){
                        sum += 10;
                    }
                    for (int i=0; i<name.length; i++){
                        if (name[i].equals(bbb.name)){
                            sum += name.length-i;
                        }
                    }
                    bbb.val = sum;
                    valarray[count2] = bbb.val;
                    count2++;
                }

                int sadsadsad = 0;
                Arrays.sort(valarray);
                for (int i=valarray.length-1; i>=0; i--){
                    Iterator<usr> asas = result.iterator();
                    while (asas.hasNext()){
                        usr ooo = asas.next();
                        if (ooo.val==valarray[i]){
                            System.out.println(ooo.name);
                        }
                    }
                }

            }
        }

    }
}

class usr {
    String name;
    String marry;
    int workage;
    int score;
    int val = 0;
}