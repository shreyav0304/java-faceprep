import java.util.*;

public class Solution {

public static void main(String[] args) {
    

    Scanner obj = new Scanner(System.in);
    int num = obj.nextInt();


    int copy =recur(num);
     System.out.println("The number of digits in "+num+" is "+copy);
     obj.close();

}
  private static int recur(int num){
         int count =0;
         while(num!=0){
        num = num/10;
        count++;
    }

        return count;

       
        
    }
   
}