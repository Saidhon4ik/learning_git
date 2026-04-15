public class Car {
    String make;
    String model;
    String color;
    int year;


    Car(String make, String model, int year, String color)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void drive()
    {
        System.out.println("You drive the " + this.color + " "  + this.model);
    }

        void brake()
    {
        System.out.println("You stopped the " + this.color + " "  + this.model);
    }

    @Override
    public String toString()
    {
        return this.color + " " + this.year + " " +this.make + " " + this.model;
    }
}