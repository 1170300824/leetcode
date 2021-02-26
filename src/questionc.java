import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class questionc {
    /**
     * 广度优先搜索，就是连通图最多有多少点
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<node> nodes = new HashSet<>();
        while (in.hasNext()){
            int number1 = in.nextInt();
            int number2 = in.nextInt();
        }
    }
}

class node{
    int number = 0;
    Set<node> friends = new HashSet<>();
}
