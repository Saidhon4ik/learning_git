

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


// public class Main{
//     public static void main(String[] args)
//     {
//         //Interface
//         Rabbit rabbit = new Rabbit();
//         Hawk hawk = new Hawk();
//         F1sh fish = new F1sh();
    
//         rabbit.flee();
//         hawk.hunt();

//         fish.hunt();
//         fish.flee();    
        

//     }
// }


// public class Main{
//     public static void main(String[] args)
//     {
//         //Polymorphysm
//         Caar caar = new Caar();
//         Boat boat = new Boat();
//         Bike bike = new Bike();

//         bike.go();
//         caar.go();
//         boat.go();

//         Vehicle[] vehicles = {caar,bike , boat};

//         for(Vehicle vehicle : vehicles)
//         {
//             vehicle.go();
//         }
//     }
// }

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner scanner = new Scanner(System.in);

//         Aniimal aniimal;

//         System.out.print("Would you like a dog or a cat?(1 = dog, 2 = cat): ");
//         int choice = scanner.nextInt();

//         if(choice == 1)
//         {
//             aniimal = new D0g();
//             aniimal.speak();
//         }
//         else if(choice == 2)
//         {
//             aniimal = new Kitty();
//             aniimal.speak();
//         }
//         else
//         {
//             System.out.println("You have to choose 1 or 2, please");
//         }


//         scanner.close();
//     }
// }







// //Getters and setters
// public class Main{
//     public static void main(String[] args)
//     {
//         Caaar caaar = new Caaar("Charger", "yellow", 10000);
//         System.out.print(caaar.getModel() + " " + caaar.getColor() + " " + caaar.getPrice());

//         // caaar.model = "Corverette";
        

//     }

// }



// public class Main{
//     public static void main(String[] args)
//     {
//         // Aggregation = Represents a "has-a" relationship between objects.
//         // One object contains another object as part of its structure,
//         // but the contained object/s can exist independently.
//         Book book1 = new Book("The Fellow of the Ring",  423);
//         Book book2 = new Book("The Two Towers",  352);
//         Book book3 = new Book("The Return of the King",  416);


//         Book[] books = {book1, book2, book3};


//         Library library = new Library("NYC Public Library", 1897, books);


//         library.displayInfo();
//     }
// }




// public class Main{
//     public static void main(String[] args)
//     //composition - "part-of" relationship
//     //Engine is part of a car
//     {
//         Caaaar caaaar = new Caaaar("Corvette", 2025, "V8");


//         System.out.println(caaaar.model);
//         System.out.println(caaaar.year);
//         System.out.println(caaaar.engine.type);
        
//         caaaar.start();
//     }
// } 






// public class Main{
//     public static void main(String[] args)
//     {
//         //Wrapper classes = allow primitives(int char double boolean)
//         //to be used a objects



//         // //Autoboxin is used nowadays >>
//         // Integer a = 123;
//         // Double b = 3.14;
//         // Character c = '$';
//         // Boolean d = true;
//         // String e = "Pizza";



//         // //Unboxing
//         // int x = a;
//         // double y = b;
//         // char z = c;
//         // boolean i = d;
//         // String j = e;


//         // System.out.println(x);
//         // System.out.println(y);
//         // System.out.println(z);
//         // System.out.println(i);
//         // System.out.println(j);

//         String a = Integer.toString(123);
//         String b = Double.toString(3.14);
//         String c = Character.toString('@');
//         String d = Boolean.toString(false);


//         //'undo' it 
//         int e = Integer.parseInt("123");
//         double f = Double.parseDouble("3.14");
//         char g = "Pizza".charAt(0); //unrelated to wrapper class XD
//         boolean h = Boolean.parseBoolean("true");
        
//         String x = a+b+c+d;
//         System.out.println(x);
//     }
// }







// //Arraylist

// import java.util.ArrayList;
// import java.util.Collections;
// public class Main{
//     public static void main(String[] args)
//     {
//         //Arraylist
//         ArrayList<String> list = new ArrayList<>();
//         list.add("potato");
//         list.add("Apple");
//         list.add("Banana");

//         // list.remove(1);

//         list.set(0, "Pineapple");

//         System.out.println(list);
//         // System.out.println(list.get(2));
//         // System.out.println(list.size());


//         Collections.sort(list);
//         System.out.println(list);
//     }
// }

// //exercise for ArrayList

// import java.util.ArrayList;
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args)
//     {
//         int numOfFruit;
//         Scanner scanner = new Scanner(System.in);

//         ArrayList<String> foods = new ArrayList<>();
//         System.out.print("Enter the number of food you would like: ");
//         numOfFruit = scanner.nextInt();
//         scanner.nextLine();

//         for(int i = 1; i <= numOfFruit; i++)
//         {
//             System.out.print("Enter food #" + i + " : ");
//             String food = scanner.nextLine();
//             foods.add(food);
//         }   

//         for(String food: foods)
//         {
//             System.out.println(food);
//         }

//         scanner.close();
//     }
// }


// //Exceptions
// import java.util.InputMismatchException;
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner scanner = new Scanner(System.in);



//         try{
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         System.out.println(number);
//         }
//         catch(InputMismatchException e){
//             System.out.println("You have to enter integer buddy");
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("You cannot divide by a zero, bruh");
//         }
//         catch(Exception e)
//         {   
//             //Safety net
//             System.out.println("Something went wrong!");
//         }

//         finally{
//         scanner.close();
//         }
//     }
// }



// //Writing files

// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Main {
//     public static void main(String[] args)
//     {
//         //FileWriter = small - medium files
//         //Buffered Writer = for large files
//         //Print Writed =  best for structured data, like logs or reports
//         //FileOutputStream = Best for binary files(e.g photos, images, audio files)

//         // String filePath;
//         // String textContent = "I like pizza \n It is really good";
//         String textContent = """
//                 Roses are red
//                 Violets are blue
//                 Why do i have such a head
//                 I have no clue🤣
//                 """;

//         try(FileWriter writer = new FileWriter("test.txt");)
//         {
//             writer.write(textContent);
//             System.out.println("File has been written!");
//         }
        
//         catch(FileNotFoundException e)
//         {
//             System.out.println("Could not locate file location!");
//         }
//         catch(IOException e){
//             System.out.println("Could not write file");
//         }
//     }
// }




//How to read a file


// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// public class Main{
//     public static void main(String[] args)
//     {
//         //three ways to read a file:
//         //Buffered Reader + File Reader: best for reading text line by line
//         //FileInoutStream : best for binary files(e.g images, audio files)
//         //RandomAccessFile: Best for read write speicific portion of  a large text
        
//         String filePath = "C:\\Users\\Saidkhon\\Desktop\\test.txt";
//         try(BufferedReader reader = new BufferedReader(new FileReader(filePath));)
//         {
//             String  line;
//             while ((line = reader.readLine())!= null) {
//                 System.out.println(line);
//             }
//         }
//         catch(FileNotFoundException e)
//         {
//             System.out.println("Could not find a file");
//         }

//         catch(IOException exception)
//         {
//             System.out.println("Something went wrong");
//         }
    
//     }
// }