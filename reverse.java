import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        rev(a);
        sc.close();
    }

    public static void rev(String a) {
        int l = a.length();
        int s = 0, e = l - 1;

        for (int i = l - 1; i >= 0; i--) {
            if (a.charAt(i) == ' ' || i == 0) {
                if (i == 0) {
                    s = 0;
                } else {
                    s = i + 1;
                }
                for (int j = s; j <= e; j++) {
                    System.out.print(a.charAt(j));
                }
                e = i - 1;
                System.out.print(" ");
                
            }
            
        }
    
    }
    
}

