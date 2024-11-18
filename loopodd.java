public class loopodd {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i<=5 ; i++) {
            for (int k = 1; k<=5-i; k++) {
                System.out.println(" ");
                for (int j = 1; j <= x; j++) 
                System.out.print(x);
                System.out.println();
                x=x+2;
                
            }
        }
    }
}
