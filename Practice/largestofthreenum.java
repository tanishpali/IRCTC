public class largestofthreenum {
    public static void main(String[] args) {
        

        int a = 25, b = 40, c = 65;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(largest);

    }


    
}
