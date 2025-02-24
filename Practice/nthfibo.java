import java .util.*;

public class nthfibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       System.out.println("Enter the nth number:");
       int n =sc.nextInt();

       if(n<=0){
        System.out.println("Enter Positive Number");
       } else if(n==1){
            System.out.println("1st Fibonacci number is 0");
       }else if (n==2){
        System.out.println("2nd Fibonacci number is 1");
       }
        int a=0;int b=1;int c=0;
        for(int i=0;i<n;i++){
           c=a+b;
           a=b;
           b=c;
        }System.out.println(c);
       }
    }

