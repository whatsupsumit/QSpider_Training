import java.util.Scanner;

public class CountElementsEqualAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int average = sum / n; 
        int count = 0;

        // Count elements equal to average
        for (int i = 0; i < n; i++) {
            if (arr[i] == average) {
                count++;
            }
        }

        System.out.println("Number of elements equal to average: " + count);
    }
}
