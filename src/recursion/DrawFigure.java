package recursion;

import java.util.*;

public class DrawFigure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number, please:");

        int num = Integer.parseInt(scanner.nextLine());

        drawPicture(num);



    }

    public static void drawPicture(int n){
        if( n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        drawPicture(n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

}
