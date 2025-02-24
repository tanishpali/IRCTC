import java.util.*;
public class charul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if(ch>65 && ch<90){
            System.out.println((char)(ch+32));

        }else {
            System.out.println((char)(ch-32));
            
        

        // alternate method
        // if(ch>65 && ch<90){
        //     System.out.println(Character.toLowerCase(ch));

        // }else {
        //     System.out.println(Character.toUpperCase(ch));




    }
    
}
}