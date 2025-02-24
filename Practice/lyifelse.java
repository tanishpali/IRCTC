import java.util.*;
public class lyifelse {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();\
        // String ans =(n%100)&&(n%100!=0)||(n%400==0)
        if(n%4==0){
         } if(n%100!=0 ){
                System.out.println("yes");
            } else if (n%400==0){
                System.out.println("yes");
            }
            
         else{
System.out.println("no");

        }
        
    }

    
}
