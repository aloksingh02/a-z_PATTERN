//sample output of plain quadrilateral
//****
//****
//****

import java.util.Scanner;
public class Pattern_plainQuadrilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int a = sc.nextInt();
        System.out.println("Enter the no. of cols");
        int b = sc.nextInt();

        for(int i=1; i<=a; i++){   // this row
            for(int j=1; j<=b; j++){  // this cols
                System.out.print("* ");
            }
            System.out.println(); //this works as to print next line
        }
    }
}
