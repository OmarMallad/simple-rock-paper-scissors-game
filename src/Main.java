import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String choice = "";
        String[] secondChoice = {"rock", "paper", "scissors"};
        int len = 0;
        String holdAnswer = "";

        System.out.println("*******************");
        System.out.println("Welcome to our game");
        System.out.println("*******************");
        System.out.print("Please choose one of the following (Rock, Paper, Scissors): ");

        while (true) {
            choice = scanner.next().toLowerCase();

            if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
                break;
            } else {
                System.out.print("Please enter one of the three choices: ");
            }
        }

        len = random.nextInt(0, secondChoice.length);
        holdAnswer = secondChoice[len];

        System.out.println(checkAnswer(choice, holdAnswer));

        scanner.close();
    }

    static String checkAnswer(String ourAnswer, String computerAnswer) {

        String status = "";

        if (ourAnswer.equals(computerAnswer)) {
            status = "It's a tie!";
        } else if (ourAnswer.equals("rock")) {
            status = (computerAnswer.equals("paper")) ? "You lose!" : "You win!";
        } else if (ourAnswer.equals("paper")) {
            status = (computerAnswer.equals("scissors")) ? "You lose!" : "You win!";
        } else if (ourAnswer.equals("scissors")) {
            status = (computerAnswer.equals("rock")) ? "You lose!" : "You win!";
        }

        return "Computer chose: " + computerAnswer + "\n" + status;
    }
}