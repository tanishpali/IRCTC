import java.util.Scanner;

public class findNum {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size =sc.nextInt();
	int[]number = new  int[size]; 
	    
	    for(int i = 0;i<size;i++){ //input ke liye loop
	        number[i]=sc.nextInt();
	    }
	    int x = sc.nextInt(); //no.jo dundhna h
	    for(int  i = 0 ;i<size;i++){// output ke liye loop
	        if(number[i]==x){
	            System.out.println("no.found");
	            
	       
	        }
	    }
    
}
}5
