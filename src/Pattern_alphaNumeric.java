import java.util.Scanner;
public class Pattern_alphaNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side a");
        int a = sc.nextInt();
        System.out.println("Enter the side b");
        int b = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                if(i%2!=0){
                    System.out.print(i);
                }
                else{
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
