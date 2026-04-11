//rock  paper scissors
import java.util.Scanner;
import java.util.Random;
public class main1{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String choices[] = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.print("Enter your move(rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") &&
         !playerChoice.equals("paper") &&
         !playerChoice.equals("scissors")){
            System.out.print("Invalid choice!");
        }


        computerChoice = choices[random.nextInt(0,3)];
        System.out.printf("Computer chooses: %s", computerChoice);

        scanner.close(); 
    }
}