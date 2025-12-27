// 101. WAJP to find count of elements which are divisible by k.

import java.util.Scanner;

public class Dividebyk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i]% k ==0)
            {
                count++;
            }
        }

        System.out.println("Count of elements divisible by " + k + " = " + count);
    }
}
