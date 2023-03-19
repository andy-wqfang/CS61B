/** Class that draws a triangle using *
 * @author: Fang Wenqu
 */ 
import java.util.Scanner;
 public class DrawTriangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        int m = Integer.parseInt(args[0]);
        tree(n);
        tree(m);
        
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i + 1; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.print("\n");
        // }
        reader.close();
    }
    public static void tree(int n) {
        if (n <= 0) {
            return;
        }
        else {
            tree(n-1);

            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
 }