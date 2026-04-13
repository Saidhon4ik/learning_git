

//             Random random = new Random();

//             String choices[] = {"rock","paper","scissors"};
//             String playerChoice;
//             String computerChoice;
//             String playAgain = "yes";

//             do { 
//                 System.out.print("Enter your move(rock, paper, scissors): ");
//             playerChoice = scanner.nextLine().toLowerCase();

//             if(!playerChoice.equals("rock") &&
//             !playerChoice.equals("paper") &&
//             !playerChoice.equals("scissors")){
//                 System.out.println("Invalid choice!");
//                 continue;
//             }


//             computerChoice = choices[random.nextInt(0,3)];
//             System.out.println("Computer chooses: " + computerChoice);

//             if(playerChoice.equals(computerChoice))
//             {
//                 System.out.print("It's a tie");
//             }
//             else if
//             (playerChoice.equals("rock") && computerChoice.equals("scissors")
//             || playerChoice.equals("scissors") && computerChoice.equals("paper")
//             || playerChoice.equals("paper") && computerChoice.equals("rock"))
//             {
//                 System.out.println("You won");
//             }
//             else
//             {
//                 System.out.println("You lost");
//             }

//             System.out.print("Play again?(yes/no): ");
//             playAgain = scanner.nextLine();
            
//             } while(playAgain.equals("yes"));

//             System.out.print("Thanks for playing");
//             scanner.close();
//         }
//     }
// }


// //OOP
// public class main1{
//     public static void main(String[] args)
//     {
//         // Car car1 = new Car();
//         // Car car2 = new Car();
//         // System.out.println(car1.model);
//         // System.out.println(car1.price);
//         // System.out.println(car1.year);
//         // System.out.println(car1.make);
//         // System.out.println(car1.isRunning);

//         // car1.start();
//         // car1.stop();
        
//         // car1.drive();
//         // car1.brake();

//         // System.out.println(car1.make + " " + car1.model);
//         // System.out.println(car2.make + " " + car2.model);

//     }
// }




// //Constructors
// public class main1{
//     public static void main(String[] args)
//     {
//         Student student1 = new Student("Spongebob", 30,3.2);
//         Student student2 = new Student("Patrick", 34, 1.5);
//         Student student3 = new Student("Sandy",27,4.0);

//         System.out.println(student1.name);
//         System.out.println(student1.age);
//         System.out.println(student1.gpa);
//         System.out.println(student1.isEnrolled);
        
//         System.out.println();
        
//         System.out.println(student2.name);
//         System.out.println(student2.age);
//         System.out.println(student2.gpa);
//         System.out.println(student2.isEnrolled);
        
//         System.out.println();

//         System.out.println(student3.name);
//         System.out.println(student3.age);
//         System.out.println(student3.gpa);
//         System.out.println(student3.isEnrolled);
        
//         System.out.println();

//         student1.study();
//         student2.study();
//         student3.study();
 
//     }
// }




// public class main1{
//     public static void main(String[] args)
//     {
//         //Overloaded constructor
//         User user1 = new User("Spongebob");
//         User user2 = new User("Patrick", "PStar@aol.com");
//         User user3 = new User("Sandy", "SCheeks@gmail.com",27);
//         User user4 = new User();


//         System.out.println(user1.username);
//         System.out.println(user1.email);
//         System.out.println(user1.age);

//         System.out.println();
        
//         System.out.println(user2.username);
//         System.out.println(user2.email);
//         System.out.println(user2.age);
        
//         System.out.println();

//         System.out.println(user3.username);
//         System.out.println(user3.email);
//         System.out.println(user3.age);

//         System.out.println();

//         System.out.println(user4.username);
//         System.out.println(user4.email);
//         System.out.println(user4.age);
        
//     }
// }