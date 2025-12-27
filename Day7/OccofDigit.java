import java.util.Scanner;

public class OccofDigit {

    // Method to count occurrences of digit k in number n
    public static int countDigit(int n, int k) {
        int count = 0;
        while (n != 0) {
            if (n % 10 == k) {
                count++;
            }
            n /= 10;
        }
        return count;
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

        // Input digit k
        System.out.print("Enter digit k: ");
        int k = sc.nextInt();

        int maxCount = -1;
        int result = -1;

        // Loop to find number with max occurrences of k
        for (int i = 0; i < n; i++) {
            int count = countDigit(arr[i], k);
            if (count > maxCount) {
                maxCount = count;
                result = arr[i];
            }
        }

        System.out.println("Number with maximum occurrence of " + k + " is: " + result);
    }
}
