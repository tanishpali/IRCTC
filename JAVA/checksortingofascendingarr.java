import java.util.*;

public class checksortingofascendingarr {//isme ascending order khud likhna h or check krna h
    
    public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int size =sc.nextInt();
	    
	    int [] arr = new int[size];
	    
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
	     boolean sorted = true;
	     for(int i=1;i<size;i++){
	         if(arr[i]<arr[i-1]){
	             sorted =false;
	             return;
	         }
	     }if(sorted){
	         System.out.println("sorted in ascending");
	     }else{
	         System.out.println("not sorted");
	     }
	     
	}
}
