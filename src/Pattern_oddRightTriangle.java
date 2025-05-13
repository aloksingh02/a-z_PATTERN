import java.util.Scanner;
public class Pattern_oddRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side row a: ");
        int a = sc.nextInt();
        System.out.println("enter side col b: ");
        int b = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print((2*j+1)+" ");
            }
            System.out.println();
        }
    }
}
