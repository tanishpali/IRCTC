import java.util.*;
public class leapyear1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any year");
        int y= sc.nextInt();
        String ans = (y%4==0) && (y%100!=0) || (y%400==0)?"Leap Year":" Not a leap Year ";
        System.out.println(ans);
           

    }
    
}
