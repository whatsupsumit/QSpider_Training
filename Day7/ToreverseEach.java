import java.util.Scanner;

public class ToreverseEach {

    // Method to reverse a number
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse each element
        for (int i = 0; i < n; i++) {
            arr[i] = reverseNumber(arr[i]);
        }

        // Print reversed array
        System.out.println("Array after reversing each element:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
