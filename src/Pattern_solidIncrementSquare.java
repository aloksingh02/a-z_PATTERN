import java.util.Scanner;
public class Pattern_solidIncrementSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
