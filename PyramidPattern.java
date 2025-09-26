import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int rows = s1.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
