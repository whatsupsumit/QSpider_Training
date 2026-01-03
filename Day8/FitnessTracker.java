import java.util.Scanner;
public class FitnessTracker {

    int steps;
    double calories;

    // 1. No-argument method to take steps input
    void inputSteps() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total steps walked today: ");
        steps = sc.nextInt();
    }

    // 2. Parameterized method (standard calculation)
    double calculateCalories(int steps) {
        return steps * 0.04;
    }

    // 3. Overloaded method (weight-adjusted calculation)
    double calculateCalories(int steps, double weight) {
        return steps * weight * 0.0005;
    }

    // 4. No-argument method to show summary
    void showSummary() {
        System.out.println("\n--- Daily Fitness Summary ---");
        System.out.println("Total Steps: " + steps);
        System.out.println("Calories Burned: " + Math.round(calories));
    }

    public static void main(String[] args) {

        FitnessTracker ft = new FitnessTracker();
        Scanner sc = new Scanner(System.in);

        // Step input
        ft.inputSteps();

        System.out.print("Do you want weight-based calculation? (yes/no): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter your weight (kg): ");
            double weight = sc.nextDouble();

            ft.calories = ft.calculateCalories(ft.steps, weight);
        } else {
            ft.calories = ft.calculateCalories(ft.steps);
        }

        // Display summary
        ft.showSummary();
    }
}
