import java.util.*;
public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp=2;

       if(a%2==0 && a%3==0){
        System.out.println("Given number is not a  prime number");
       } else if(temp%2==0){
        System.out.println("Given number is a  prime number");
        }else{
            System.out.println("prime");
        }
       



    }
}
