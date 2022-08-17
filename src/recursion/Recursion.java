package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr  = Arrays.stream(scanner.nextLine().
                split("\\s+")).
                mapToInt(Integer::parseInt).toArray();

        int sum = sumNumbers(arr,0);

        System.out.println(sum);



    }
    public static int sumNumbers(int[] arr,int index){

        if(index >= arr.length){
            return 0;
        }

        return arr[index] + sumNumbers(arr,index + 1);
    }
}
