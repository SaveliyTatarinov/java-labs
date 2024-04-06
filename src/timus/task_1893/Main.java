package timus.task_1893;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seat = scanner.next();

        int row = Integer.parseInt(seat.substring(0, seat.length() - 1));
        char seatLetter = seat.charAt(seat.length() - 1);

        if ((row >= 1 && row <= 2) && (seatLetter == 'A' || seatLetter == 'D')) {
            System.out.println("window");
        } else if ((row >= 1 && row <= 2) && (seatLetter == 'B' || seatLetter == 'C')) {
            System.out.println("aisle");
        } else if ((row >= 3 && row <= 20) && (seatLetter == 'A' || seatLetter == 'F')) {
            System.out.println("window");
        } else if ((row >= 3 && row <= 20) && (seatLetter == 'B' || seatLetter == 'C' || seatLetter == 'D' || seatLetter == 'E')) {
            System.out.println("aisle");
        } else if ((row >= 21 && row <= 65) && (seatLetter == 'A' || seatLetter == 'K')) {
            System.out.println("window");
        } else if ((row >= 21 && row <= 65) && (seatLetter == 'C' || seatLetter == 'D' || seatLetter == 'G' || seatLetter == 'H')) {
            System.out.println("aisle");
        } else {
            System.out.println("neither");
        }
    }
}
