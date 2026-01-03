import java.util.Scanner;

public class leaderElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Leader elements are: ");
        
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight +" ");
        
        // Traverse from second last
        for (int i = n-2; i >=0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}
