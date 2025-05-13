//this is solid number square
//12345
//12345
//12345
//12345
//12345

import java.util.Scanner;
public class Pattern_numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n side");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
            System.out.print(j);
        }
            System.out.println();
    }
}
}
