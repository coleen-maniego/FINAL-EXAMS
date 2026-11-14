import java.util.Scanner;

public class ReadyforWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        String choice;
        String retry;

		do {
            int timedelay = 0;

          System.out.println("\n---Going to Work---");

        while (true) {
            System.out.println("\n••The sun is shining and you are about to wake up and get ready for work.••");
            System.out.print("Would you either: a. get up, b. snooze the alarm to take a nap or c. take a nap for a little longer?");
            choice = input.nextLine().trim().toLowerCase();

            if (choice.equals("a")) {
                System.out.println("*You stretched your arms up as you get out of the bed");
                break;
            } else if (choice.equals("b")) {
                System.out.println("*You snooze your clock to a few minutes then you get up.");
                timedelay = 2;
                break;
            } else if (choice.equals("c")) {
                System.out.println("*You are about to take a nap. Then after a few minutes, you realized you slept too long and quickly get out of the bed");
                timedelay = 5;
                break;
            } else {
                System.out.println("Invalid");
            }
        }
                while (true) {
            System.out.println("\n••You are about to take a bath and getting ready••");
            System.out.print("Would you either: a. do it a little quicker or b. do it slowly?");
            choice = input.nextLine().trim().toLowerCase();

            if (choice.equals("a")) {
                System.out.println(" ");
                break;
            } else if (choice.equals("b")) {
                System.out.println(" ");
                timedelay = 2;
                break;
            } else {
                System.out.println("Invalid");
            }
        }
                while (true) {
            System.out.println("\n••After wearing a suit, you noticed no was inside your house, then you found food in the fridge. A pot of cold soup that needs to be reheated to be eaten, a frozen yoghurt and a cold roasted chicken leg that needs reheated in a microwave to be eaten. You have time to cook before you leave the house for work••");
            System.out.print("What food you want to cook ");
            choice = input.nextLine().trim().toLowerCase();

            if (choice.equals("a")) {
                System.out.println("*You reheat the soup and it taste like savory sour tangy flavoured mushroom soup");
                timedelay += 3;
                break;
            } else if (choice.equals("b")) {
                System.out.println("*It tastes like ice c");
                break;
            } else if (choice.equals("c")) {
                System.out.println("*You cooked that chicken and tastes like gravy..");
                timedelay += 1;
                break;
            } else {
                System.out.println("Invalid");
            }
        }
        
                        while (true) {
            System.out.println("\n••You're now ready for work but you don't know what transportation you're going to use even if your workplace is near your location in a few km away••");
            System.out.print("Would you a. walk, b. ride a motorcycle or use a train?");
            choice = input.nextLine().trim().toLowerCase();

            if (choice.equals("a")) {
                System.out.println("*You decided to walk and you exhausted once reached to your workplace.");
                timedelay = 5;
                break;
            } else if (choice.equals("b")) {
                System.out.println("*You chose a motorcycle and you may encountered road traffic");
                timedelay = 2;
                break;
             }   else if (choice.equals("c")) {
                System.out.println("*You chose to ride on a train and it was easier to ride.");
                timedelay = 2;
                break;
            } else {
                System.out.println("Invalid");
            }
        }

        if (timedelay < 6) {
            System.out.println(">>>You arrived to the workplace and your boss and the employees are happy that you arrived on time<<<");
        } else {
            System.out.println(">>You were late to the workplace and your boss is disappointed in you for not arriving in time!");
        }
        
        System.out.print("Play again? Type YES or NO: ");
            retry = input.nextLine().trim().toLowerCase();

        } while (retry.equals("yes"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}