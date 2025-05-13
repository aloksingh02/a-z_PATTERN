import java.util.Scanner;
public class Pattern_ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from where it convert into alphabet");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }
}
