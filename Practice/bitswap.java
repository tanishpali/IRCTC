public class bitswap {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;

        a=a^b;
        b=a^b;
        a=a^b;
        

        System.out.println(a);
        System.out.println(b);
    }
}
