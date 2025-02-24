import java.util.*;
public class menudriiven {

    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("<--------------MENU----------------->");
        System.out.println("Press 1 to check number is even or odd");
        System.out.println("Press 2 to find the reverse of that number");
        System.out.println("Press 3 to check palindrome");
        System.out.println("Press 4 check armstrong number");
        System.out.println("Press 5 to check whether a given number is dividible by 3");
        int n=sc.nextInt();
        if( n<=5){
            System.out.println("Enter three digit number:");
            int a = sc.nextInt();
        } else{
            System.out.println("not in menu ");
        }
        
        
        int a = sc.nextInt();

        switch(n){
            
            case 1:System.out.println(a%2==0);
            break;

            case 2:int b =a%10;
            a=a/10;
            int c =a%10;
            a=a/10;
            int d=a;
            System.out.println(b*100+c*10+d);
            break;

            case 3:int e =a%10;
            a=a/10;
            int f =a%10;
            a=a/10;
            int g=a;
        System.out.println(e+" "+f+" "+g);
        break;
         
        case 4: int h =a%10;
        a=a/10;
        int i =a%10;
        a=a/10;
        int j=a;
        System.out.println(h*h*h+i*i*i+j*j*j);
        break;

        case 5: System.out.println(a % 3==0);
        break;
            
        
    }
}
    }
