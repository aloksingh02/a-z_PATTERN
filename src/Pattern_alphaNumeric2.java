import java.util.Scanner;
public class Pattern_alphaNumeric2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side row a");
        int a = sc.nextInt();
        System.out.println("Enter the side column b");
        int b = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<a+1-i; j++){
                if(i%2!=0) {
                    System.out.print((char)(i+64)+ " ");
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
