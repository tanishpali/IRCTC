import java.util.*;
public class tani {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;
        for(;n>0;n=n/10
        ){
            int rem=n%10;
            rev=rev*10+rem;
            System.out.println(rev);

        }

        


    }

}