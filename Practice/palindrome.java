import java.util.*;
public class palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int a = n%10;
        n=n/10;
        int  b = n%10;
        n=n/10;
        int c = n%10;
        

        // System.out.println(a*100+b*10+c*1);
        System.out.println(a*100+b*10+c);

        


        
    }
}
