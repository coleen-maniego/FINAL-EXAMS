import java.util.Scanner;

public class TrueOrFalseGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "Internet is a global network that connect millions of gadgets globally.",
            "Data Leaks or Data Breaches refers to gaining personal information.",
            "Web Developer uses HTML, CSS and Javascript to create websites.",
            "Javascript creates web content.",
            "Router refers to data being converted between different networks.", 
            "Data Privacy endangers users information."
        };

        boolean[] answers = {true, false, true, false, true, false};
        String playAgain;

        do {
            int score = 0;

            System.out.println("\n=== True or False Game ===");

            for (int i = 0; i < questions.length; i++) {
                System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
                System.out.print("Enter T or F: ");

                String input = scanner.nextLine().trim().toUpperCase();

                while (!input.equals("T") && !input.equals("F")) {
                    System.out.print("Please enter T or F: ");
                    input = scanner.nextLine().trim().toUpperCase();
                }

                boolean playerAnswer = input.equals("T");

                if (playerAnswer == answers[i]) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect.");
                }
            }

            System.out.println("\nYour score: " + score + " out of " + questions.length);

            if (score == 0) {
                System.out.println("Game Over!");
                playAgain = "yes";
            } else if (score < 3) {
                System.out.print("Low Score! Try again?");
                 playAgain = scanner.nextLine().trim().toLowerCase();
            } else if (score == 3) {
             System.out.print("Good Job! Try again?");   
              playAgain = scanner.nextLine().trim().toLowerCase();
             } else if (score > 3) {
             System.out.print("Very Good!");   
              playAgain = scanner.nextLine().trim().toLowerCase();
             } else {
                System.out.print("OUTSTANDING!");
                playAgain = scanner.nextLine().trim().toLowerCase();
            }

        } while (playAgain.equals("yes") || playAgain.equals("y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
