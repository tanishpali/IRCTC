import java.util.*;
public class praRec {
    public static int GT(int a,int c,int d) {
        return a+c+d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         int a =0;
         int b=0;
         int c=0;
         int d=0;

        a=n%10;
        b=n/10;
        c=b%10;
        d=b/10;

int f = GT(a,c,d);
System.out.println(f);
        

        


    
    }

}