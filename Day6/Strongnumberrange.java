public class Strongnumberrange {

    // method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // method to check strong number
    static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {

        System.out.println("Strong numbers from 1 to 1000:");

        for (int i = 1; i <= 1000; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
    }
}
