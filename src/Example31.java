import java.util.Scanner;
public class Example31 {
    public static void main(String[] argv) {
        int i, j, n;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter the no of lines");
        n = inputValue.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.printf(" /");
            }
            for (j = i; j > 0; j--) {
                System.out.printf(" %d", j);
            }
            for (j = 2; j <= i; j++) {
                System.out.printf(" %d", j);
            }
            for (j = 1; j <= n-i ; j++) {
                System.out.printf(" /");
            }
            System.out.println();
        }
    }
}
