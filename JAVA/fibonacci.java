import java .util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        int n = sc.nextInt();
        int a =0;
        int b= 1;
        int c =0;

        // System.out.println(a+" "+b+" ");

        for(int i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        

    }
}
