import java.util.Stack;
import java.util.Scanner;

public class PostfixEvaluation {
    public static int evaluatePostfix(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            else if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }else{
                int b=stack.pop();
                int a=stack.pop();
                if(ch=='+'){
                    int c=a+b;
                    stack.push(c);
                }else if(ch=='-'){
                    int c=a-b;
                    stack.push(c);
                }else if(ch=='*'){
                    int c=a*b;
                    stack.push(c);
                }
            }
        }
        return stack.pop();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int result=evaluatePostfix(input);
        System.out.println(result);
        sc.close();
    }
}


