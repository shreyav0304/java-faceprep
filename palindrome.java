import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        String rev="";
        for (int i=len-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
    
}
