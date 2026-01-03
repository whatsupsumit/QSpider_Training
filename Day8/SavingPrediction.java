import java.util.Scanner;

public class SavingPrediction {
    static double predict(double income, double expenses) {
        return income - expenses;
    }
//if it is a festivemonth
    static double predict(double income, double expenses, boolean festiveMonth) {
        if (festiveMonth) {
            expenses = expenses + (expenses * 0.20); 
            System.out.println("Festive expenses = " + expenses);
        }
        return income - expenses;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income: ");
        double income = sc.nextDouble();
        System.out.println("Enter the Expense: ");
        double expense = sc.nextDouble();
        System.out.println("Festive month: ");
        boolean month  = sc.nextBoolean();

        double saving;
        if(month)
        {
            saving = predict(income, expense, month); 
        }
        else{
            saving = predict(income, expense);
        }

        System.out.println("Saving is equal to:"+ saving);

        sc.close();
    }
}
