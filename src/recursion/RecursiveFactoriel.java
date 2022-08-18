package recursion;

import java.util.Scanner;

public class RecursiveFactoriel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number, please:");

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(calculateFactorial(num));

    }

    static long calculateFactorial(int n){
        if(n == 1){
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

}
