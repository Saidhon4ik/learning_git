

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
// public class Main{
//     public static void main(String[] args)
//     {
//         Car car1 = new Car("Mers","Red");
//         Car car2 = new Car("Nexia", "black");
//         System.out.println(car1.model);
//         System.out.println(car2.model);
// ;
        
//         car1.drive();
//         car1.brake();

//     }
// }




// //Constructors
// public class Main{
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




// public class Main{
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

// public class Main{
//     public static void main(String[] args)
//     {
//         // Car car1 = new Car("Mustang", "Red");
//         // Car car2 = new Car("Corverrete" , "Blue");
//         // Car car3 = new Car("Charger" , "Yellow");

//         // Car[] cars = {car1, car2, car3};

//         Car[] cars = {
//             new Car("Mustang", "Red"),
//             new Car("Corverrete" , "Blue"),
//             new Car("Charger" , "Yellow")

//         };

        
//         for(Car car : cars){
//             car.color = "black";
//         }

//         for(Car car : cars){
//             car.drive();
//         }
//     }
// }



// //static keyword, what is it
// public class Main{
//     public static void main(String[] args)
//     {
//         Friend friend1 = new Friend("Spongebob");
//         Friend friend2 = new Friend("Patrick");
//         System.out.println(friend1.name);
//         System.out.println(friend2.name);

//         System.out.println(Friend.numOfFriends);
//         Friend.showFriends();
//     }
// 


//inheritance
// public class Main{
//     public static void main(String[] args)
//     {   
//         Dog dog = new Dog();
//         Cat cat = new Cat();
//         Plant plant = new Plant();
        
//         System.out.println(dog.isAlive);
//         System.out.println(cat.isAlive);
//         System.out.println(plant.isAlive);
//         System.out.println();

//         dog.eat();
//         cat.eat();
//         plant.photosynthesize();
//         System.out.println();

//         System.out.println(dog.lives);
//         System.out.println(cat.lives);
//         System.out.println();

        
//    }
// }




// public class Main{
//     public static void main(String [] args)
//     {
//         //Super shit, refers to the parent class subclass < superclass
//         //like parent is always right l🤣
//         Person person = new Person("Tom", "Riddle");
//         Students student = new Students("Harry", "Potter", 3.25);
//         Employee employee = new Employee("Asteroid", "Destroyer", 1000);
//         person.showName();

//         student.showName();
//         student.showGpa();

//         employee.showName();
//         employee.showSalary();
//     }
// }


//method overriding
// public class Main{
//     public static void main(String[] args)
//     {
//         Dog dog = new Dog();
//         Cat cat = new Cat();
//         Fish fish = new Fish();

//         dog.move();
//         cat.move();
//         fish.move();
//     }
// }



// public class Main{
//     public static void main(String[] args)
//     {
//         Car car1 = new Car("Ford", "Mustang", 2025, "Red");
//         Car car2 = new Car("Chevrolette", "Corvette", 2026, "Blue");
//         System.out.println(car1);
//         System.out.println(car2);
//     }
// }




// public class Main{
//     public static void main(String[] args)
//     {
//         //Abstract
//         Circle circle = new Circle(3);
//         Triangle triangle = new Triangle(4,5);
//         Rectangle rectangle = new Rectangle(6,7);

//         circle.display();
//         triangle.display();
//         rectangle.display();

//         System.out.println(circle.area());
//         System.out.println(triangle.area());
//         System.out.println(rectangle.area());
//     }
// }


public class Main{
    public static void main(String[] args)
    {
        //Interface
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        F1sh fish = new F1sh();
    
        rabbit.flee();
        hawk.hunt();

        fish.hunt();
        fish.flee();    
        

    }
}