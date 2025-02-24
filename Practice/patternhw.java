public class patternhw {
    public static void main(String[] args) {

        // for(int i=0;i<=5;i++){
        //     for(int j=0;j<=5-i;j++){
        //         System.out.print("  ");
        //     }for(int k=0;k<=i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

            for(int i=1;i<=4;i++){
                if(i==5)continue;
                for(int j=i;j<=i-1;j++){
                    System.out.print("  ");
                    }
                for(int k=1;k<=6-i;k++){
                System.out.print("*  ");
                }
           if(i<=3) System.out.println();
            
           


            for(int i=1;i<=6;i++){
                for(int j=i;j<=6-i;j++){
                    System.out.print("  ");
                    }
                for(int k=1;k<=i-1;k++){
                System.out.print("*  ");
                }
                System.out.println();
    }
}

}
}