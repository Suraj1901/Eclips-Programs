package Patterns;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {//1; 1<=5 ; 2
            for (int j = n; j > i; j--) {// 1 ; 1 > 1 ; 1
                System.out.print(" "); //----
            }
            for (int k = 1; k <= (2 * i - 1); k++) {// 1 ; 1 <= 1 ; 2
                if (k == 1 || k == (2 * i - 1)) {// 1 || 1
                    System.out.print("*"); // ----*
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
