import java.util.*;
public class opertorque{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //    -------------------->>>>>>>Armstrong
       
        int n = 153;

        int temp = n;

        int a = n%10;
        n = n/10;
        int b = n%10;
        n=n/10;
        int c = n%10;

        System.out.println(n);

        int arm = a*a*a + b*b*b + c*c*c;

        String ans = (arm == temp) ? "yes" : "no";
        System.out.println(ans);

        // ----------------->>>>>>>>>> reverse
        int n= 231;

         int a = n%10;
        n = n/10;
        int b = n%10;
        n=n/10;
        int c = n%10;
        System.out.println(a*100+b*10+c*1);

        // ------>                Palindrome

        int n= 121;
        int temp = n;
        int a = n%10;
       n = n/10;
       int b = n%10;
                                    
       n=n/10;                   
       int c = n%10;

       int rev = a*100 + b*10 + c*1;

       String ans = (rev==temp) ? "yes": "no";
       System.out.println(ans);



    }

}