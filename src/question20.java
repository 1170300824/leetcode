import java.util.Stack;

public class question20 {
    public static void main(String[] args) {
        isValid(")");
    }

    public static boolean isValid(String s) {
        Stack stack = new Stack();
        for (char temp:s.toCharArray()){
            if (temp=='[' || temp=='{' || temp=='('){
                stack.push(temp);
            }else if (temp==']' && !stack.empty() && stack.peek().toString().equals("[")){
                stack.pop();
            }else if (temp=='}' && !stack.empty() && stack.peek().toString().equals("{")){
                stack.pop();
            }else if (temp==')' && !stack.empty() && stack.peek().toString().equals("(")){
                stack.pop();
            }else {
                return false;
            }
        }
        if (stack.size() == 0){
            return true;
        }else {
            return false;
        }
    }

}
