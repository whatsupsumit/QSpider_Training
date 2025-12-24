import java.util.Scanner;

public class digitFactorial {

    // method to calculate factorial
    static int factorial(int d) {
        int fact = 1;
        for (int i = 1; i <= d; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();   // e.g. 342

        while (n > 0) {
            int digit = n % 10;          // get last digit
            System.out.println(digit + "! = " + factorial(digit));
            n = n / 10;                  // remove last digit
        }
    }
}
