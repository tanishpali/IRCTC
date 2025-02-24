import java.util.*;
public class stringIMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        String ans1=" ";
        String ans2=" ";
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch>=48 && ch<=57){
            ans1= ans1+ch;
        }
        else{
            ans2=ans2+ch;
        }
    }
    System.out.println(ans1+"  "+ans2);


    }
}
