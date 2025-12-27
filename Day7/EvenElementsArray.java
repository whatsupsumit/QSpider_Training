// WAJP Even , Smallest , Largest , Second largest, 
import java.util.Scanner;


public class EvenElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Even element: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Prime elements: ");
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        //perfect number in the given array 
        System.out.print("Perfect numbers: ");
        for (int i = 0; i < n; i++) {
            if (isPerfect(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        //finding the Sum of elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements: " + sum);

        //finding the largest element....
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element: " + max);

        //Finding the smallest element...
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element: " + min);

        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }

        System.out.println("Second largest: " + secMax);

        int secMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > min && arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        System.out.println("Second smallest: " + secMin);
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static boolean isPerfect(int num) {
        if (num <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
