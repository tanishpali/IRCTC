import java.util.*;
public class tableof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int pro =1;

        do{
            
              pro=n*i;
            i++;
            System.out.println(n+"*"+(i-1)+"="+pro);
           
            
        }while(i<=10);
        
    }
}
