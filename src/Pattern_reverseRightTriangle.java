import java.util.Scanner;
public class Pattern_reverseRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side row a: ");
        int a = sc.nextInt();
        System.out.print("Enter the side column b: ");
        int b = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=a+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
