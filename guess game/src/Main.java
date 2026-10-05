import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the number game!!!");
        boolean hasWon = false;
        String playAgain = "yes";
        while(playAgain.equalsIgnoreCase("yes")){
            System.out.println("Do you wanna play(Yes/No)");
            playAgain = scanner.next();
            if(!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing!");
                break;                                         }
        for(int i=0 ; i<3 ; i++) {
            System.out.print("Enter your guess : ");
            int user_guess = 0;
            try{
                user_guess = scanner.nextInt();
            }catch (java.util.InputMismatchException e) {
                System.out.println("Invalid please try again");
                scanner.next();
                i--;
                continue;
            }

            int result = (int) Math.round(Math.random() * 100);
            System.out.println("The number generated  is " + result);
            if (user_guess == result) {
                System.out.println("You win 😁👍");
                hasWon = true;
                break;
            }
            if (!hasWon)
                System.out.println("You loose 😂😂");
        }

        }

    }
}