
import java.util.Scanner;

public class Specialnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int product = 1;

        while(temp<0)
        {
            int dig = temp%10;
            sum = sum + dig;
            product = product * dig;
            temp = temp/10;
        }
        if(sum+product == num) System.out.println(num+" is a Special number");
        else System.out.println(num+" is not a Special number");
    }
}
