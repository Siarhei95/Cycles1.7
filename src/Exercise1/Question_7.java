package Exercise1;
import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter min number: m = ");
        int m = scanner.nextInt(); // start
        System.out.print("Enter max number: n = ");
        int n = scanner.nextInt(); // finish
        m = m - 1;
        while (m < n) {
            m++;
            for (int i = 2; i <= m; i++) {
                if (m % i == 0) {
                    if (m != i)
                        System.out.println(m + ": - Divider = " + i);

                }
            }
        }
    }
}


































