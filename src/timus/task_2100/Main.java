package timus.task_2100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        int totalGuests = n + 2;

        for (int i = 0; i < n; i++) {
            String response = input.nextLine();
            if (response.contains("+one")) {
                totalGuests++;
            }
        }

        int lunchCost;

        if (totalGuests == 13){
            lunchCost = 1400;
        } else {
            lunchCost = totalGuests * 100;
        }

        System.out.println(lunchCost);
    }
}
