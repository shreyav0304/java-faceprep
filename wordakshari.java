import java.util.*;
public class wordakshari {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String b="";
        String c="####";
        String a;
        do{
            a=sc.nextLine();
            if (b.isEmpty()||a.charAt(0)==b.charAt(b.length()-1)){
                System.out.println(a);

            }
            b=a;
        }while(!a.equals(c));
        sc.close(); 
        


    }
    
}
