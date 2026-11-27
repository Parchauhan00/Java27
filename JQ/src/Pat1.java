public class Pat1 {

    static void main() {
        int x = 5;
       // squareHollow_Pat(x);
        NumberTriangular(x) ;


    }
    public static void squareHollow_Pat(int x) {
        for (int i =1; i<=x;i++) {
            for (int j = 1;j<=x;j++) {
                if (i==1 || j==1 || i==x || j==x ){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void NumberTriangular(int x) {
        for (int i = 0;i<x;i++) {
            for (int j = 0;j<x-i;j++) {
                System.out.print(" ");
            }
            for (int k = 0;k<x;k++) {
                System.out.println(i);
            }
        }
    }
}
