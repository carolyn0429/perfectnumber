import java.util.Scanner;

/**
 * Created by carolynhung on 3/21/18.
 */
public class PerfectNumber {

    public static void isAPerfectNumber(int num) {
        int sum = 0;
        for (int i=1; i<num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: \n");
        int num = scanner.nextInt();
        isAPerfectNumber(num);
    }
}
