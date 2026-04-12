//rock  paper scissors
import java.util.Scanner;
import java.util.Random;
public class main1{
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {

            Random random = new Random();

            String choices[] = {"rock","paper","scissors"};
            String playerChoice;
            String computerChoice;
            String playAgain = "yes";

            do { 
                System.out.print("Enter your move(rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
            !playerChoice.equals("paper") &&
            !playerChoice.equals("scissors")){
                System.out.println("Invalid choice!");
                continue;
            }


            computerChoice = choices[random.nextInt(0,3)];
            System.out.println("Computer chooses: " + computerChoice);

            if(playerChoice.equals(computerChoice))
            {
                System.out.print("It's a tie");
            }
            else if
            (playerChoice.equals("rock") && computerChoice.equals("scissors")
            || playerChoice.equals("scissors") && computerChoice.equals("paper")
            || playerChoice.equals("paper") && computerChoice.equals("rock"))
            {
                System.out.println("You won");
            }
            else
            {
                System.out.println("You lost");
            }

            System.out.print("Play again?(yes/no): ");
            playAgain = scanner.nextLine();
            
            } while(playAgain.equals("yes"));

            System.out.print("Thanks for playing");
            scanner.close();
        }
    }
}