import java.util.Scanner;

public class armsdo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s =Integer.toString(n);
        int count =s.length();
        int temp = n;
        double arm = 0;
      
       
        do{
            int digit=n%10;
            arm = arm + Math.pow(digit,count);
            n=n/10;
           
        }while(n>0);
        String ans = arm == temp ?"Armstrong":"Not an armstrong";
        System.out.println(ans);
    }
}
