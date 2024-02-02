package code30days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    System.out.println("Meal Cost:"+meal_cost);
    double tip = (meal_cost/100)*tip_percent;
    System.out.println("tip:"+tip);
    double tax = (meal_cost/100)*tax_percent;
    System.out.println("tax:"+tax);
    double fin = meal_cost+tip+tax;
    System.out.println("meal_cost+tip+tax:"+fin);
     int final_cost = (int)(Math.round(meal_cost+tip+tax));
    System.out.println(final_cost);

    }

}

public class Day2 {
     public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
