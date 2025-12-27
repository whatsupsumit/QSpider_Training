import java.util.Scanner;

public class SmartTracker {

    public static void main(String[] args) {
        int[] sales = {120, 80, 150, 90, 200, 75, 110}; 
        int[] temperatures = {32, 28, 31, 29, 35, 27, 30};

        int n = temperatures.length;
        // Activity 1 – Average Temperature
        double avgTemp = 0;
        int sumTemp = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sumTemp += temperatures[i];
        }
        avgTemp = Math.round((sumTemp / (double) n) * 10.0) / 10.0;
        System.out.println("Average Temperature: " + avgTemp + "C"); {
        }

        // Activity 2 – Hottest and Coldest Day
        int highest = temperatures[0], lowest = temperatures[0];
        int highestDay = 1, lowestDay = 1;
        for (int i = 0; i < n; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
                highestDay = i + 1;
            }
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
                lowestDay = i + 1;
            }
        }
        System.out.println("Highest temp: "+ highest);
        System.out.println("Lowest temp: "+ lowest);

        int count=0;
        // Activity 3 - Count days with temp > 30 C
        for(int i=0; i<n ; i++)
        {
            if(temperatures[i]>30) count++;
        }

        System.out.println("Days with temp greater than 30 C : "+ count);

        //For average Sales and total Sales
        double avgSale = 0;
        int sumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSale += sales[i];
        }
        System.out.println("Total Sale: "+sumSale);
        avgSale = Math.round((sumSale / (double) sales.length) * 100.0) / 100.0;
        System.out.println("Average Sales: " + avgSale); 

        int highestSale = sales[0], lowestSale = sales[0];
        int highestSaleDay = 1, lowestSaleDay = 1;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > highestSale) {
                highestSale = sales[i];
                highestSaleDay = i + 1;
            }
            if (sales[i] < lowestSale) {
                lowestSale = sales[i];
                lowestSaleDay = i + 1;
            }
        }

        System.out.println("Highest Sale: " + highestSale + " on Day " + highestSaleDay);
        System.out.println("Lowest Sale: " + lowestSale + " on Day " + lowestSaleDay);

//      Sales above 100
        int scount = 0;
        for(int i=0; i<sales.length ; i++)
        {
            if(sales[i]>100) scount++;
        }

        System.out.println("Days with Sales greater than 100 : "+ scount);

        //to find the sales day
        int saleToSearch = 150;
        int saleFoundDay = -1;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == saleToSearch) {
                saleFoundDay = i + 1;
                break;
            }
        }
        if (saleFoundDay != -1) {
            System.out.println("Sale " + saleToSearch + " found on Day " + saleFoundDay);
        } else {
            System.out.println("Sale " + saleToSearch + " not found.");
        }

        // Activity 8 – Update Sales Record (Day 2 to 95)
        for (int i = 0; i < sales.length; i++) {
            if (i == 1) { 
                sales[i] = 95;
            }
        }
        for (int i = 0; i < sales.length; i++) {
            if (i == 1) {
                System.out.println("Updated sales for Day 2: " + sales[i]);
            }
        }
    }
}


























// import java.util.Scanner;

// public class SmartTracker {

//     public static void main(String[] args) {
//         int[] sales = {120, 80, 150, 90, 200, 75, 110}; 
//         int[] temperatures = {32, 28, 31, 29, 35, 27, 30};

//         // Activity 1 – Average Temperature
//         double avgTemp = 0;
//         int sumTemp = 0;
//         for (int i = 0; i < temperatures.length; i++) {
//             sumTemp += temperatures[i];
//         }
//         avgTemp = Math.round((sumTemp / (double) temperatures.length) * 10.0) / 10.0;
//         System.out.println("Average Temperature: " + avgTemp + "°C");

//         // Activity 2 – Hottest and Coldest Day
//         int highest = temperatures[0], lowest = temperatures[0];
//         int highestDay = 1, lowestDay = 1;
//         for (int i = 0; i < temperatures.length; i++) {
//             if (temperatures[i] > highest) {
//                 highest = temperatures[i];
//                 highestDay = i + 1;
//             }
//             if (temperatures[i] < lowest) {
//                 lowest = temperatures[i];
//                 lowestDay = i + 1;
//             }
//         }
//         System.out.println("Highest Temperature: " + highest + "°C on Day " + highestDay);
//         System.out.println("Lowest Temperature: " + lowest + "°C on Day " + lowestDay);

//         // Activity 3 – Count Hot Days
//         int hotDays = 0;
//         for (int i = 0; i < temperatures.length; i++) {
//             if (temperatures[i] > 30) hotDays++;
//         }
//         System.out.println("Number of hot days (>30°C): " + hotDays);

//         // Activity 4 – Total and Average Sales
//         int totalSales = 0;
//         for (int i = 0; i < sales.length; i++) {
//             totalSales += sales[i];
//         }
//         double avgSales = totalSales / (double) sales.length;
//         System.out.println("Total Sales: " + totalSales);
//         System.out.printf("Average Sales: %.2f\n", avgSales);

//         // Activity 5 – Record-Breaking Sales
//         int highestSale = sales[0], lowestSale = sales[0];
//         int highestSaleDay = 1, lowestSaleDay = 1;
//         for (int i = 0; i < sales.length; i++) {
//             if (sales[i] > highestSale) {
//                 highestSale = sales[i];
//                 highestSaleDay = i + 1;
//             }
//             if (sales[i] < lowestSale) {
//                 lowestSale = sales[i];
//                 lowestSaleDay = i + 1;
//             }
//         }
//         System.out.println("Highest Sale: " + highestSale + " on Day " + highestSaleDay);
//         System.out.println("Lowest Sale: " + lowestSale + " on Day " + lowestSaleDay);

//         // Activity 6 – Count High-Sales Days
//         int highSalesDays = 0;
//         for (int i = 0; i < sales.length; i++) {
//             if (sales[i] > 100) highSalesDays++;
//         }
//         System.out.println("Number of high sales days (>100): " + highSalesDays);

//         // Activity 7 – Search for a Specific Sale
//         int saleToSearch = 150;
//         int saleFoundDay = -1;
//         for (int i = 0; i < sales.length; i++) {
//             if (sales[i] == saleToSearch) {
//                 saleFoundDay = i + 1;
//                 break;
//             }
//         }
//         if (saleFoundDay != -1) {
//             System.out.println("Sale " + saleToSearch + " found on Day " + saleFoundDay);
//         } else {
//             System.out.println("Sale " + saleToSearch + " not found.");
//         }

//         // Activity 8 – Update Sales Record (Day 2 to 95)
//         for (int i = 0; i < sales.length; i++) {
//             if (i == 1) { // Day 2
//                 sales[i] = 95;
//             }
//         }
//         for (int i = 0; i < sales.length; i++) {
//             if (i == 1) {
//                 System.out.println("Updated sales for Day 2: " + sales[i]);
//             }
//         }
//     }
// }
