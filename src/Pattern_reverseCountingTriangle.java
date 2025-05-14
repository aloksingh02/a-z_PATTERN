import java.util.Scanner;
public class Pattern_reverseCountingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int a = sc.nextInt();
        System.out.print("Enter column: ");
        int b = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=a+1-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
