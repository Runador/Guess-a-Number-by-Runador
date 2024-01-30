import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerNumber = random.nextInt(100);
        int counter = 0;
        System.out.print("**********************************************\n");
        System.out.println("*-*-*-*-*-*-*-*-*-*-**-*-*-*-**-*-*-*-*-*-*-*-");
        System.out.println("----------------------------------------------");
        System.out.print(ANSI_PURPLE);
        System.out.print(ANSI_BOLD);
        System.out.print("Enter is your name: ");
        String name = scanner.nextLine();
        System.out.println("----------------------------------------------");
        System.out.println(ANSI_BLACK);
        printDashes(name);
        System.out.print("--------");
        System.out.print("\nHello, " + name + "!\n");
        printDashes(name);
        System.out.print("--------");
        System.out.println();

        while (true) {

            System.out.println(ANSI_BLUE);
            String guess = "Guess a number from 1 to 100:";
            printDashes(guess);
            System.out.println("\nGuess a number from 1 to 100: ");

            try {
                int playerInput = Integer.parseInt(scanner.nextLine());

                if (playerInput >= 0 && playerInput <= 100) {
                    counter++;
                    if (computerNumber != playerInput) {
                        if (computerNumber <= playerInput) {
                            System.out.println(ANSI_RED);
                            String tooHigh = "It's too High! Try again..    ";
                            printDashes(tooHigh);
                            System.out.print("\n  It's too High! Try again..\n");
                            printDashes(tooHigh);
                            System.out.println();
                        } else {
                            System.out.println(ANSI_RED);
                            String tooLow = "It's too Low! Try again..    ";
                            printDashes(tooLow);
                            System.out.print("\n  It's too Low! Try again..\n");
                            printDashes(tooLow);
                            System.out.println();
                        }
                    } else {
                        System.out.println(ANSI_BOLD);
                        System.out.println("\n" + name + ", you guessed it!");
                        System.out.println(ANSI_PURPLE);
                        System.out.println("Congratulations!");
                        System.out.println(ANSI_BLACK);
                        System.out.println("Number of attempts: " + counter);
                        System.out.println("------------------------------");
                        System.out.println("*-*-*-*-*-*-*-*-*-*-**-*-*-*-*");
                        System.out.print("******************************\n");
                        break;
                    }
                } else {
                    System.out.println(ANSI_RED);
                    String invalidNumber = "Invalid number! The number should be from 0 to 100.";
                    printDashes(invalidNumber);
                    System.out.println("\nInvalid number! The number should be from 0 to 100.");
                    printDashes(invalidNumber);
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED);
                System.out.println("---------------------------------------------");
                System.out.println("Invalid data type. You should enter a number!");
                System.out.println("---------------------------------------------");
            }

        }
    }

    private static void printDashes(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.print("-");
        }
    }
}
