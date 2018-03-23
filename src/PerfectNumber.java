import java.util.Scanner;

/**
 * Created by carolynhung on 3/21/18.
 */
public class PerfectNumber {

    private static void perfectNumberInRange(int lower, int upper) {
        int count = 0;
        int sum, j;
        for (int i = lower; i<=upper; i++) {
            sum = 0;
            for (j = 1 ; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                count ++;
                System.out.println(i + " is a perfect number.");
            }
        }
        if(count == 0){
            System.out.println("There is no perfect numbers in range " + lower + " and " + upper);
        } else if(count == 1) {
            System.out.println("There is " + count + " perfect number in range " + lower + " and " + upper);
        } else {
            System.out.println("There are " + count + "perfect numbers in range " + lower + " and " + upper);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a lower bound number: \n");
        int lowerBound = scanner.nextInt();
        System.out.println("Please enter a upper bound number: \n");
        int upperBound = scanner.nextInt();
        perfectNumberInRange(lowerBound, upperBound);
    }
}
