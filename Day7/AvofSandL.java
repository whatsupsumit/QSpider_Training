import java.util.Scanner;

public class AvofSandL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max =arr[0];
        int min= arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max =arr[i];
            if(arr[i] <min) min =arr[i];
        }
        int sum = 0;
        double count =0;
        for (int i= 0; i < n; i++) {
            if (arr[i] ==min || arr[i] ==max) {
                sum +=arr[i];
                count++;
            }
        }

        double avg = (double) sum / count;
        System.out.println("Average of all min and max occurrences: " + avg);
    }
}
